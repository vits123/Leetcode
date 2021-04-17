package com.problems.myleetcode.Top100;

public class CountBits {

  public static void main(String[] args) {
    CountBits cb = new CountBits();
    System.out.println(cb.countBits(10)); // 1010
  }

  private static short countBits(int x) {
    short numBits = 0;
    while (x != 0) {
      numBits += (x & 1);
      x >>>= 1;
    }
    return numBits;
  }
}
