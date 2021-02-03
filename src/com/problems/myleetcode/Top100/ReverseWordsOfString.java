package com.problems.myleetcode.Top100;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Leetcode 151 Algorithm: Using built in Split + reverse
 * Time Complexity - O(N) -> where N is the
 * no. of characters in the given string
 * Space Complexity - O(N) -> to store the result of split by
 * spaces
 */
public class ReverseWordsOfString {

  public String reverseWords(String s) {
    s = s.trim();
    List<String> wordList = Arrays.asList(s.split("\\s+"));
    Collections.reverse(wordList);
    return String.join(" ", wordList);
  }

  public static void main(String[] args) {
    ReverseWordsOfString sw1 = new ReverseWordsOfString();
    System.out.println(sw1.reverseWords("I Love Leetcode"));
  }
}
