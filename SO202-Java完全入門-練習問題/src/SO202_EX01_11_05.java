/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter11 問題05

問題04を改造して、複数のcatch説をExceptionに対する1個のcatch節にまとめたうえで、
例外が発生したら使い方を出力してください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_11_05.java
Starting audit...
Audit done.
>>> javac SO202_EX01_11_05.java
================

実行例
================
>>>> java SO202_EX01_11_05 1200 3
400
>>>> java SO202_EX01_11_05
usage: java SO202_EX01_11_05 integer integer
>>>> java SO202_EX01_11_05 abc 3
usage: java SO202_EX01_11_05 integer integer
>>>> java SO202_EX01_11_05 1200 0
usage: java SO202_EX01_11_05 integer integer
================

*/


// ここより下に解答を記載する。
