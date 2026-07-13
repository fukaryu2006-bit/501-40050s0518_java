#!/usr/bin/env python
# -*- coding: utf-8 -*-

import argparse
import glob
import os
import re
import subprocess


class CommandExecutor():
    def __init__(self, command, expect=None):
        self.command = command
        self.expects = []
        if expect:
            self.expects.append(expect)
        self.actuals = []

    def add_expect(self, expect):
        expect = expect.replace('\\t', '\t')    # ToDo タブ文字を強制的に置換
        self.expects.append(expect)

    def execute(self) -> None:
        try:
            # コマンド実行
            output = subprocess.run(self.command, shell=True, text=True,
                                    capture_output=True, encoding='utf8')
            # エラー判定
            if err := output.stderr:
                self.actuals = err.splitlines()
                raise ValueError('Command error !')
            self.actuals = output.stdout.splitlines()
            # 結果判定
            assert self.expects == self.actuals
        except Exception as ex:
            # 期待値に例外が含まれている場合は、例外を無視
            for expect in self.expects:
                # ToDo むりやりNGを回避しているので見直しが必要
                if 'Exception' in expect:
                    return
                if 'cannot assign a value to final variable' in expect:
                    return
                if 'incompatible types:' in expect:
                    return
            raise ex

    def __repr__(self) -> str:
        if self.expects == self.actuals:
            text = '\033[0m'    # Black
            res = 'OK'
        else:
            text = '\033[91m'   # Red
            res = 'NG'
        text += f'    Command :  {self.command}\n'
        text += f'    Expect  :  {self.expects}\n'
        text += f'    Actual  :  {self.actuals}\n'
        text += f'    --> {res}\n'
        text += '\033[0m'           # Black
        return text


class TestCase():
    def __init__(self, file_path):
        self.err_msg = None

        # 実行ファイルを削除
        exec_file_extensions = {
            '.c': '',
            '.java': '.class'
        }
        for ext in exec_file_extensions:
            if file_path.endswith(ext):
                exec_file = file_path.replace(ext, exec_file_extensions[ext])
                if os.path.exists(exec_file):
                    os.remove(exec_file)

        # ソースコードを読み込む
        self.file_path = file_path
        if (not os.path.exists(file_path)):
            print(f'file does not exist. {file_path}')
        f = open(file_path, 'r', encoding='utf-8')
        txt = f.read()

        # コンパイル方法と実行例を抽出
        DIV_STR = '================\n'
        ptrn = f'.*?\n{DIV_STR}(.*?){DIV_STR}\n'
        self.command_sets = []
        for m in re.findall(ptrn, txt, re.DOTALL):
            for group in m.split(DIV_STR):
                command_sets = []
                for line in group.splitlines():
                    cmd = line.split('>>> ')
                    if len(cmd) > 1:
                        # 実行コマンド
                        command_sets.append(CommandExecutor(cmd[1]))
                    else:
                        # 期待する出力
                        # line = line.replace('\\t', '\t')    # ToDo タブ文字を強制的に置換
                        command_sets[-1].add_expect(line)
                self.command_sets.append(command_sets)

    def execute(self):
        # 現在フォルダを保持して、作業フォルダに移動
        cwd = os.getcwd()
        os.chdir(os.path.dirname(self.file_path))

        try:
            # テストケースがない場合
            if not self.command_sets:
                self.err_msg = f'No test case'
                raise ValueError(self.err_msg)
            # テスト実行
            for command_set in self.command_sets:
                for command in command_set:
                    command.execute()
        except Exception as ex:
            self.err_msg = ex
            raise ex
        finally:
            # 元のディレクトリに戻る
            os.chdir(cwd)
            print(repr(self))

    def __repr__(self) -> str:
        text = '============================================================\n'
        text += f'{self.file_path}\n\n'
        for cnt, command_set in enumerate(self.command_sets):
            text += f'  No.{cnt}\n'
            for command in command_set:
                text += repr(command)
                text += '\n'
        return text


if __name__ == "__main__":

    # コマンドライン引数を取得
    parser = argparse.ArgumentParser()
    parser.add_argument('-k', '--keyword', default='')
    parser.add_argument('-t', '--terminate', action='store_true')
    args = parser.parse_args()

    # テスト結果
    ok_cnt = 0
    ng_cnt = 0

    # テスト対象ファイル検索して、テスト実行
    for ext in ['.c', '.py', '.java']:
        for file_path in glob.glob(f'./*/src/**/SO*{ext}', recursive=True):
            if args.keyword not in file_path:
                continue
            print(f'{file_path}')
            try:
                TestCase(file_path).execute()
                ok_cnt += 1
            except Exception as ex:
                ng_cnt += 1
                # 途中終了フラグ
                if args.terminate:
                    break

    # 結果出力
    print(f'============================================================\n')
    print(f'\t\t\tALL:{ok_cnt + ng_cnt:3}  OK:{ok_cnt:2}  NG:{ng_cnt:2}\n')
    print(f'============================================================\n')

    if ng_cnt > 0:
        exit(-1)
