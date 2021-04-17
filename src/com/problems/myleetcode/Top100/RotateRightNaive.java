package com.problems.myleetcode.Top100;

/**
 * Time - O(nk), Space - O(1)
 */
public class RotateRightNaive {

  public static void rotate(int[] A, int k) {
    int N = A.length;
    k %= N;
    int tmp, prev;

    for (int i = 0; i < k; i++) {
      prev = A[N - 1];
      for (int j = 0; j < N; j++) {
        tmp = A[j];
        A[j] = prev;
        prev = tmp;
      }
    }
  }

  public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5, 6, 7};
    RotateRightNaive.rotate(A, 3);
    for (int e : A) {
      System.out.print(e + " ");
    }
  }
}
