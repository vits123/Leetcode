package data_structure.sorting;

import java.util.Arrays;

/**
 * Merge sort with O(1) space and O(nlgn) time.
 * For integer types merge sort can be made inplace
 * using some math trick of modulus and division.
 * First we have to find a value greater than all the
 * elements of the array. Now we can store the original value as modulus and the second value as
 * division. Suppose we want to store arr[i] and arr[j] both at index i(means in arr[i]). First we
 * have to find a ‘maxval’ greater than both arr[i] and arr[j]. Now we can store as arr[i] = arr[i]
 * + arr[j]*maxval. Now arr[i]%maxval will give the original value of arr[i] and arr[i]/maxval will
 * give the value of arr[j].
 * So below is the implementation on merge sort.
 */
public class MergeSortOptimized {

  public static void main(String[] args) {
    int[] arr = {999, 612, 589, 856, 56, 945, 243};
    int n = arr.length;
    mergeSort(arr, n);
    System.out.println("Sorted array :");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  private static void mergeSort(int[] arr, int n) {
    int maxele = Arrays.stream(arr).max().getAsInt() + 1;
    mergeSortRec(arr, 0, n - 1, maxele);
  }

  private static void mergeSortRec(int[] arr, int beg, int end, int maxele) {
    if (beg < end) {
      int mid = (beg + end) / 2;
      mergeSortRec(arr, beg, mid, maxele);
      mergeSortRec(arr, mid + 1, end, maxele);
      merge(arr, beg, mid, end, maxele);
    }
  }

  private static void merge(int[] arr, int beg, int mid, int end, int maxele) {
    int i = beg;
    int j = mid + 1;
    int k = beg;

    while (i <= mid && j <= end) {
      if (arr[i] % maxele <= arr[j] % maxele) {
        arr[k] = arr[k] + (arr[i] % maxele) * maxele;
        k++;
        i++;
      } else {
        arr[k] = arr[k] + (arr[j] % maxele) * maxele;
        k++;
        j++;
      }
    }

    while (i <= mid) {
      arr[k] = arr[k] + (arr[i] % maxele) * maxele;
      k++;
      i++;
    }

    while (j <= end) {
      arr[k] = arr[k] + (arr[j] % maxele) * maxele;
      k++;
      j++;
    }

    // Obtaining actual values
    for (i = beg; i <= end; i++) {
      arr[i] = arr[i] / maxele;
    }
  }
}
