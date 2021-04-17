package geeksforgeeks;

import java.util.Scanner;

/**
 * Iterative function to calculate (a^n) in O(log y)
 */

public class BinaryExponentiation {

  static int power(int a, int n) {
    int res = 1;

    while (n > 0) {
      // If n is odd, multiply a with res
      if ((n & 1) != 0) {
        res = res * a;
      }

      // n must be even now
      n = n >> 1; // n = n/2
      a = a * a; // change a to a^2
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner scrr = new Scanner(System.in);
    System.out.println("Enter a");
    int a = scrr.nextInt();
    System.out.println("Enter n");
    int n = scrr.nextInt();
    int ans = BinaryExponentiation.power(a, n);
    System.out.println("a^n = " + ans);
  }
}
