/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter02 問題16 (改)

次のプログラムと発生エラーを見て、プログラムの誤りを修正してください。

public class SO202_EX01_02_16
  public static void main(String args) {
    System.out.println("Hello");
  }
}

発生エラー:
SO202_EX01_02_16.java:8: error: '{' expected
public class SO202_EX01_02_16
                             ^
SO202_EX01_02_16.java:9: error: class, interface, enum, or record expected
  public static void main(String args) {
                ^
SO202_EX01_02_16.java:11: error: class, interface, enum, or record expected
  }
  ^
3 errors

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_02_16.java
Starting audit...
Audit done.
>>> javac SO202_EX01_02_16.java
================

実行例
================
>>> java SO202_EX01_02_16
Hello
================

*/


// ここより下に解答を記載する。
