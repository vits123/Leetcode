package com.problems.myleetcode.Top100;

/*
    Leetcode 387
    Time - O(n), Space - O(n)
 */
public class FirstUniqueChar {

  public static int firstUniqueChar(String s) {
    int N = s.length();
    int[] frq = new int[26];

    for (int i = 0; i < N; i++) {
      frq[s.charAt(i) - 'a']++;
    }

    for (int i = 0; i < N; i++) {
      if (frq[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String str = "aabbbc";
    int ans = FirstUniqueChar.firstUniqueChar(str);
    System.out.println("Index of first unique character is: " + ans);
  }
}
