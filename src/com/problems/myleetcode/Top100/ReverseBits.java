package com.problems.myleetcode.Top100;

/**
 * Leetcode 190
 * Algorithm: In each iteration we left shift result by 1 then check if last digit of n
 * is 1; if true then add 1 to result else n >>> 1 finally return result
 * <p>
 * Time complexity - O(1)
 * Space complexity - O(1)
 */
public class ReverseBits {

  public int reverseBits(int n) {
    if (n == 0) {
      return 0;
    }

    int result = 0;
    for (int i = 0; i < 32; i++) {
      result <<= 1;
      if ((n & 1) == 1) {
        result++;
      }
      n >>>= 1;  // Unsigned right shift by 1
    }
    return result;
  }

  public static void main(String[] args) {
    ReverseBits rb = new ReverseBits();
    int ans = rb.reverseBits(13); // 1101
    System.out.println("Reversed integer is: " + ans);
  }

}
