package Project_Euler;

public class Problem4 {

  private static long reversed(long num) {
    long reversed = 0;
    long reduced;

    while (num > 0) {
      reduced = num % 10;
      reversed = reversed * 10 + reduced;
      num /= 10;
    }
    return reversed;
  }

  private static boolean isPalindrome(long num) {
    return reversed(num) == num;
  }

  private static long largestPalindrome(long a, long b) {
    long result = 0;
    long largest = 0;

    for (long x = a; x >= 99; x--) {
      for (long y = b; y >= 99; y--) {
        result = y * x;
        if (isPalindrome(result)) {
          largest = Math.max(largest, result);
        }
      }
    }

    return largest;
  }


  public static void main(String[] args) {
    System.out.println(largestPalindrome(999, 999));
  }
}
