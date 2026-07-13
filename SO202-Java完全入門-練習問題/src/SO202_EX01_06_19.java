/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter06 問題19

次のプログラムを2以上100未満の素数を出力するように修正してください。
public class SO202_EX01_06_19 {
  public static void main(String[] args) {
    for (int n = 2; n < 100; n++) {
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          continue;
        }
      }
      System.out.print(n + " ");
    }
    System.out.println();
  }
}

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_06_19.java
Starting audit...
Audit done.
>>> javac SO202_EX01_06_19.java
================

実行例
================
>>> java SO202_EX01_06_19
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
================

*/


// ここより下に解答を記載する。
