package com.problems.myleetcode.Top100;
/**
 * Leetcode 1089 Time complexity  - O(n) Space complexity - O(1)
 */

import java.util.Arrays;

public class DuplicateZerosLinear {

  public static void duplicateZeros(int[] arr) {
    int possibleDups = 0;
    int length_ = arr.length - 1; // 7

    for (int left = 0; left <= length_ - possibleDups; left++) {
      if (arr[left] == 0) {
        if (left == length_ - possibleDups) {
          arr[length_] = 0;
          length_ -= 1;
          break;
        }
        possibleDups++;
      }
    }

    int last = length_ - possibleDups;

    for (int i = last; i >= 0; i--) {
      if (arr[i] == 0) {
        arr[i + possibleDups] = 0;
        possibleDups--;
        arr[i + possibleDups] = 0;
      } else {
        arr[i + possibleDups] = arr[i];
      }

    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
    DuplicateZerosLinear.duplicateZeros(arr);
    System.out.println(Arrays.toString(arr));
  }
}
