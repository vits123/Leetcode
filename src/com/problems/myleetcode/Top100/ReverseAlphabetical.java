package com.problems.myleetcode.Top100;

/**
 * Leetcode 917
 * Time Complexity - O(n)
 * Space comlexity - O(1)
 */
public class ReverseAlphabetical {

  public static String reverseOnlyLetters(String s) {
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0, j = s.length() - 1; i < j; ) {
      if (!Character.isLetter(sb.charAt(i))) {
        ++i;
      } else if (!Character.isLetter(sb.charAt(j))) {
        --j;
      } else {
        sb.setCharAt(i, s.charAt(j));
        sb.setCharAt(j--, s.charAt(i++));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String s = "B!FDCEA2"; // A!ECDFB2
    String ans = ReverseAlphabetical.reverseOnlyLetters(s);
    System.out.println(ans);
  }
}
