/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter11 問題03

問題02を改造して、NumberFormatExceptionに対するcatch節を追加し、
例外が発生したら「error: specify integers」（エラー：整数を指定せよ）と出力してください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_11_03.java
Starting audit...
Audit done.
>>> javac SO202_EX01_11_03.java
================

実行例
================
>>>> java SO202_EX01_11_03 1200 3
400
>>>> java SO202_EX01_11_03
usage: java SO202_EX01_11_03 integer integer
>>>> java SO202_EX01_11_03 abc 3
error: specify integers
================

*/


// ここより下に解答を記載する。
