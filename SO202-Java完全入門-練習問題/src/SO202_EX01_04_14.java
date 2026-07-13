/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter04 問題14 (改)

問題13のプログラムでキャストを行わずに、int型変数 b をdouble型変数 aで初期化してください。
クラス名はSO202_EX01_04_14としてください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_04_14.java
Starting audit...
Audit done.
>>> javac SO202_EX01_04_14.java
SO202_EX01_04_14.java:35: error: incompatible types: possible lossy conversion from double to int
    int b = a;
            ^
1 error
================

実行例
================
>>> java SO202_EX01_04_14
Error: Could not find or load main class SO202_EX01_04_14
Caused by: java.lang.ClassNotFoundException: SO202_EX01_04_14
================

*/


// ここより下に解答を記載する。
