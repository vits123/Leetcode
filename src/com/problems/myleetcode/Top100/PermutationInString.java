package com.problems.myleetcode.Top100;

import java.util.Arrays;

/**
 * Leetcode 567 - Given 2 strings S1 & S2, write a function to return true if S2 contains the
 * permutation of S1. In other words, one of the first string's permutations is the substring of the
 * 2nd string Input s1 = "ab"  s2 = "eidbaooo" Output: True The input string only contains lowercase
 * letters
 */
public class PermutationInString {

  public static boolean checkInclusion(String s1, String s2) {  //s1 = "ab"  s2 = "eidbaooo"
    int m = s1.length(); // 2
    int n = s2.length(); // 8

    if (m > n) {
      return false;
    }

    int[] ar1 = new int[26];
    int[] ar2 = new int[26];

    for (int i = 0; i < m; i++) {
      ar1[s1.charAt(i) - 'a']++;
      ar2[s2.charAt(i) - 'a']++;
    }

    if (Arrays.equals(ar1, ar2)) {
      return true;
    }

    int front = 0, back = m;

    while (back < n) {
      ar2[s2.charAt(front) - 'a']--;
      ar2[s2.charAt(back) - 'a']++;

      if (Arrays.equals(ar1, ar2)) {
        return true;
      }
      front++;
      back++;
    }

    return false;
  }

  public static void main(String[] args) {
    String s1 = "ab", s2 = "eidbaooo";
    System.out.println(PermutationInString.checkInclusion(s1, s2));
  }
}
