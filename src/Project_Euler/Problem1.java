package Project_Euler;

public class Problem1 {

  static int target = 999;

  public static int sumDivisibleBy(int n) {
    int p = target / n;
    return n * (p * (p + 1)) / 2;
  }

  public static void main(String[] args) {
    int ans = sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15);
    System.out.println(ans);
  }
}
