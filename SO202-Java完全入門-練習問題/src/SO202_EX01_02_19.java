/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter02 問題19 (改)

次のプログラムと発生エラーを見て、プログラムの誤りを修正してください。

public class SO202_EX01_02_19 {
　public static void main(String[] args) {
　　System.out.println("Hello");
　}
}

発生エラー:
SO202_EX01_02_19.java:9: error: illegal character: '\u3000'
　public static void main(String[] args) {
^
SO202_EX01_02_19.java:10: error: illegal character: '\u3000'
　　System.out.println("Hello");
^
SO202_EX01_02_19.java:10: error: illegal character: '\u3000'
　　System.out.println("Hello");
 ^
SO202_EX01_02_19.java:11: error: illegal character: '\u3000'
　}
^
4 errors

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_02_19.java
Starting audit...
Audit done.
>>> javac SO202_EX01_02_19.java
================

実行例
================
>>> java SO202_EX01_02_19
Hello
================

*/


// ここより下に解答を記載する。
