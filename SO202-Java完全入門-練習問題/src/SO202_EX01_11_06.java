/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter11 問題06

問題05を改造して、catch節の例外処理に「e.printStackTrace();」を追加してください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_11_06.java
Starting audit...
Audit done.
>>> javac SO202_EX01_11_06.java
================

実行例
================
>>>> java SO202_EX01_11_06 1200 3
400
>>>> java SO202_EX01_11_06
usage: java SO202_EX01_11_06 integer integer
java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
\tat SO202_EX01_11_06.main(SO202_EX01_11_06.java:43)
>>>> java SO202_EX01_11_06 abc 3
usage: java SO202_EX01_11_06 integer integer
java.lang.NumberFormatException: For input string: "abc"
\tat java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
\tat java.base/java.lang.Integer.parseInt(Integer.java:662)
\tat java.base/java.lang.Integer.parseInt(Integer.java:778)
\tat SO202_EX01_11_06.main(SO202_EX01_11_06.java:43)
>>>> java SO202_EX01_11_06 1200 0
usage: java SO202_EX01_11_06 integer integer
java.lang.ArithmeticException: / by zero
\tat SO202_EX01_11_06.main(SO202_EX01_11_06.java:45)
================

*/


// ここより下に解答を記載する。
