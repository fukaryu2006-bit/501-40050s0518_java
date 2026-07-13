/**
プログラミング基礎Java
EX01 JAVA [完全]入門
Chapter10 問題14

Menuクラスを改造して、printメソッドの中でItemクラスをローカルクラスとして宣言します。
Item型の配列であるitemフィールドも、printメソッドの中でローカル変数として宣言してください。
改造前のMenuクラスは、Menu2として保存してください。


コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_EX01_10_14.java
Starting audit...
Audit done.
>>> javac SO202_EX01_10_14.java
SO202_EX01_10_14.java:42: error: cannot find symbol
    Menu.Item item = menu.new Item("hotcake", 200);
        ^
  symbol:   class Item
  location: class Menu
SO202_EX01_10_14.java:42: error: cannot find symbol
    Menu.Item item = menu.new Item("hotcake", 200);
                              ^
  symbol:   class Item
  location: class Menu
2 errors
================

実行例
================
================

*/


// ここより下に解答を記載する。
