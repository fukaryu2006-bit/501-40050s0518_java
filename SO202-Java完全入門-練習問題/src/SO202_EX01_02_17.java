/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter02 問題17 (改)

次のプログラムと発生エラーを見て、プログラムの誤りを修正してください。

public class SO202_EX01_02_17 {
  public static void main(String args)
    System.out.println("Hello");
  }
}

発生エラー:
SO202_EX01_02_17.java:9: error: ';' expected
  public static void main(String args)
                                      ^
SO202_EX01_02_17.java:12: error: class, interface, enum, or record expected
}
^
2 errors

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_02_17.java
Starting audit...
Audit done.
>>> javac SO202_EX01_02_17.java
================

実行例
================
>>> java SO202_EX01_02_17
Hello
================

*/


// ここより下に解答を記載する。
