package com.problems.myleetcode.Top100;

import java.util.ArrayList;
import java.util.List;

public class PlusOneDemo {

  public int[] plusOne(int[] digits) {
    int N = digits.length;
    int carry = 1;
    List<Integer> l = new ArrayList<>();

    for (int i = N - 1; i >= 0; i--) {
      int d = (digits[i] + carry) % 10;
      carry = (digits[i] + carry) / 10;
      l.add(d);
    }

    if (carry != 0) {
      l.add(1);
    }

    int[] ans = new int[l.size()];

    for (int i = 0; i < l.size(); i++) {
      ans[i] = l.get(l.size() - 1 - i);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] digits = {9, 9, 9};
    PlusOneDemo plus = new PlusOneDemo();
    int[] answer = plus.plusOne(digits);
    for (int e : answer) {
      System.out.print(e + " ");
    }
  }
}
