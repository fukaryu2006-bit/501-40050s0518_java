import java.util.Random;

public class Fixed_Random {
  // 乱数シード値
  private static final int seed = 12345;

  // 乱数取得用Randomクラス
  private static final Random random = new Random(seed);

  /**
   * 乱数取得メソッド
   */
  public static double random() {
    return random.nextDouble();
  }
}
