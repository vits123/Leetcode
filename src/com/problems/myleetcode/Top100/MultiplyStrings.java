package com.problems.myleetcode.Top100;

/**
 * Leetcode 43 - Multiply 2 integers represented by strings
 * Time complexity - O(m*n)
 * Space complexity - O(n)
 */
public class MultiplyStrings {

  public static String multiply(String num1, String num2) {
    int m = num1.length(), n = num2.length();
    int[] result = new int[m + n];

    for (int i = m - 1; i >= 0; i--) {
      for (int j = n - 1; j >= 0; j--) {
        int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        int p1 = i + j, p2 = i + j + 1;
        int sum = mul + result[p2];

        result[p1] += sum / 10; // 0 + sum / 10
        result[p2] = sum % 10;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int val : result) {
      if (!(sb.length() == 0 && val == 0)) {
        sb.append(val);
      }
    }
    return sb.length() == 0 ? "0" : sb.toString();

  }

  public static void main(String[] args) {
    System.out.println(MultiplyStrings.multiply(new String("123"), new String("45")));
  }
}
