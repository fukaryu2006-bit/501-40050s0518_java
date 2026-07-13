// ここより下に解答を記載する。

// 学生クラスの定義
class Student {
  // クラス変数の宣言
  static String school = "A高校";

  // インスタンス変数の宣言
  String name;
  String club;
  String subject;

  // コンストラクタの定義
  Student(String name, String club, String subject) {
    this.name = name;
    this.club = club;
    this.subject = subject;
  }

  // メソッドの定義
  String getInfo() {
    String text = String.format("私の名前は%sです。\n", this.name);
    text += String.format("%sの%sに入っています。\n", school, this.club);
    text += String.format("私の好きな教科は%sです。\n", this.subject);
    return text;
  }
}
