/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter02 問題10 (改)

次のプログラムと発生エラーを見て、プログラムの誤りを修正してください。
public clas SO202_EX01_02_10 {
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}

発生エラー：
SO202_EX01_02_10.java:7: error: class, interface, enum, or record expected
public clas SO202_EX01_02_10 {
       ^
SO202_EX01_02_10.java:8: error: class, interface, enum, or record expected
  public static void main(String[] args) {
                ^
SO202_EX01_02_10.java:10: error: class, interface, enum, or record expected
  }
  ^
3 errors

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_02_10.java
Starting audit...
Audit done.
>>> javac SO202_EX01_02_10.java
================

実行例
================
>>> java SO202_EX01_02_10
Hello
================

*/


// ここより下に解答を記載する。
