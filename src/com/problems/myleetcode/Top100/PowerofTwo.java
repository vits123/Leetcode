package com.problems.myleetcode.Top100;

/**
 * Leetcode 231
 * There are 4 ways to solve this problem Trick - Given no is power of 2 if no of set
 * bits are 1 else not
 */


public class PowerofTwo {

  public boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false;
    }
    return n > 0 && (n & (n - 1)) == 0;
  }

  public static void main(String[] args) {
    PowerofTwo powerofTwo = new PowerofTwo();
    System.out.println(powerofTwo.isPowerOfTwo(16));
  }

}
