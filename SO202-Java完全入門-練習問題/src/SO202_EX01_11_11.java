/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter11 問題11

Userクラスのコンストラクタを改造して、引数のnameやpasswordが空文字列の場合に、
throw文でRuntimeExceptionを発生させてください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_11_11.java
Starting audit...
Audit done.
>>> javac SO202_EX01_11_11.java
================

実行例
================
>>>> java SO202_EX01_11_11
Exception in thread "main" java.lang.RuntimeException: name is empty
\tat User1.&lt;init&gt;(User1.java:7)
\tat SO202_EX01_11_11.main(SO202_EX01_11_11.java:30)
================

*/


// ここより下に解答を記載する。
