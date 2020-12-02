package com.problems.myleetcode.Top100;

/**
 * Java program for the implementation of Insertion Sort
 * <p>
 * for j=2 to A.length key = A[j] i = j-1 while i > 0 & A[i] > key A[i+1] = A[i] i = i - 1 A[i+1] =
 * key
 */
public class InsertionSort {

  public static void main(String[] args) {
    int[] ar = {12, 11, 13, 5, 6};
    InsertionSort ob = new InsertionSort();
    ob.sort(ar);
    printArray(ar);
  }

  private static void printArray(int[] ar) {
    for (int i = 0; i < ar.length; ++i) {
      System.out.print(ar[i] + " ");
    }
  }

  private void sort(int[] ar) {
    for (int j = 1; j < ar.length; ++j) {
      int key = ar[j];
      int i = j - 1;
      while (i >= 0 && ar[i] > key) {
        ar[i + 1] = ar[i];
        i = i - 1;
        ar[i + 1] = key;
      }

    }
  }
}
