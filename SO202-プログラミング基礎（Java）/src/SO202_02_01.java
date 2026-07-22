/**
プログラミング基礎Java
基本構文
練習問題1
「これはJavaの例文です。」を10回表示してください。

コンパイル方法
================
>>> javac SO202_02_01.java
================

実行例
================
>>> java SO202_02_01
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
================

*/


// ここより下に解答を記載する。

public class SO202_01_01{
    public static void main (String[]args){
        for (int i=0;i<10;i++){
            System.out.println("これはJavaの例文です。");
        }
    }
}
