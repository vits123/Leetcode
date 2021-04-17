package com.problems.myleetcode.Top100;
/*
   Leetcode 739 - Daily Temperatures
   Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.
   For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].

  Time complexity - O(n)
  Space complexity - O(n)
 */

import java.util.Stack;

public class DailyTemperaturesDemo {

  public int[] dailyTemperature(int[] T) {
    // define stack
    Stack<Integer> st = new Stack<>();

    // define result array to hold final result
    int[] res = new int[T.length];

    for (int i = 0; i < T.length; i++) {
      while (!st.isEmpty() && T[i] > T[st.peek()]) {
        int idx = st.pop();
        res[idx] = i - idx;
      }
      st.push(i); // Push indexes on stack of respective temperatures
    }
    return res;
  }

  public static void main(String[] args) {
    DailyTemperaturesDemo temperature = new DailyTemperaturesDemo();
    int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
    int[] result = new int[arr.length];
    result = temperature.dailyTemperature(arr);
    for (int e : result) {
      System.out.print(e + " ");
    }

  }
}
