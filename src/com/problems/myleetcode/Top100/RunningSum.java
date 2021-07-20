package com.problems.myleetcode.Top100;

import java.util.Scanner;

/**
 * Time complexity - O(n), Space complexity - O(1)
 */
public class RunningSum {

  public static int[] runningSum(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    return nums;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many elements ? ");
    int N = s.nextInt();
    int[] A = new int[N];
    System.out.println("Enter array elements ");
    for (int i = 0; i < N; i++) {
      A[i] = s.nextInt();
    }

    A = runningSum(A);

    for (int e : A) {
      System.out.print(e + " ");
    }

  }
}
