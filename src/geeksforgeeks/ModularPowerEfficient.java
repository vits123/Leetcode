package geeksforgeeks;

import java.util.Scanner;

/**
 * Given 3 numbers x, y & p compute x^y % p (ab) mod p = ( (a mod p) (b mod p) ) mod p a = 50, b =
 * 100, p = 13 50 mod 13 = 11, 100 mod 13 = 9 (11 * 9) mod 13 = 8
 */
public class ModularPowerEfficient {

  static int modularPower(int x, int y, int p) {
    int res = 1;
    x = x % p; // if x >= p

    if (x == 0) {
      return 0;
    }

    while (y > 0) {
      // if y is odd
      if ((y & 1) != 0) {
        res = (res * x) % p;
      }

      // y must be even now
      y = y >> 1; // y = y/2
      x = (x * x) % p;

    }
    return res;
  }

  public static void main(String[] args) {
    Scanner ser = new Scanner(System.in);
    System.out.println("Enter x");
    int x = ser.nextInt();
    System.out.println("Enter y");
    int y = ser.nextInt();
    System.out.println("Enter p");
    int p = ser.nextInt();
    System.out.println("Power is " + modularPower(x, y, p));
  }
}
