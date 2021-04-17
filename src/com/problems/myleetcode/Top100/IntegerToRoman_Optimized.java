package com.problems.myleetcode.Top100;

/**
 * Leetcode 12. Integer to Roman
 * Time Complexity - O(1)
 * Space Complexity - O(1)
 */
public class IntegerToRoman_Optimized {

  int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
  String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

  public String intToRoman(int number) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < values.length && number >= 0; i++) {
      while (values[i] <= number) {
        number -= values[i];
        sb.append(symbols[i]);
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    int number = 58;
    IntegerToRoman_Optimized iro = new IntegerToRoman_Optimized();
    System.out.println(iro.intToRoman(number));
  }
}
