package com.problems.myleetcode.Top100;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode 190: Follow up Question: If this function is called many times, how would you optimize
 * it? How can we solved it without using loop?
 * Algorithm: Mask and Shift In this algorithm we first
 * convert given n into 4 bytes and then reverse each byte & store intermediate results into cache to improve performance.
 * Finally, we combine each reversed byte into reversed number..
 */
public class ReverseBitsOptimized {

  private final Map<Byte, Integer> cache = new HashMap<Byte, Integer>();

  public int reverseBits(int n) {

    byte[] bytes = new byte[4];

    for (int i = 0; i < 4; i++) {
      bytes[i] = (byte) ((n >>> 8 * i) & 0xFF);  // convert given int into bytes
    }
    int result = 0;
    for (int i = 0; i < 4; i++) {
      result += reverseBytes(bytes[i]); // reverse per byte
      if (i < 3) {
        result <<= 8;
      }
    }
    return result;
  }

  private int reverseBytes(byte aByte) {
    Integer value = cache.get(aByte);
    if (value != null) {
      return value;
    }
    value = 0;
    for (int i = 0; i < 8; i++) {
      value += ((aByte >>> i) & 1);
      if (i < 7) {
        value <<= 1;
      }
    }
    cache.put(aByte, value);
    return value;
  }

  public static void main(String[] args) {
    ReverseBitsOptimized rbo = new ReverseBitsOptimized();
    int ans = rbo.reverseBits(13);
    System.out.println("Reversed integer is " + ans);
  }
}
