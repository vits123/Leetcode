package geeksforgeeks;

import java.util.Scanner;

public class KthSmallest {

  public static void main(String[] args) {
    Integer arr[] = new Integer[]{12, 3, 5, 7, 4, 19, 26};
    Scanner s = new Scanner(System.in);
    System.out.println("Enter k");
    int k = s.nextInt();
    System.out.println("Kth smallest element: " + kthSmallestEle(arr, 0, arr.length - 1, k));
  }

  private static int kthSmallestEle(Integer[] arr, int l, int r, int k) {
    if (k > 0 && k <= r - l + 1) {
      // partition the array around last element and get position of pivot in sorted array
      int pos = partition(arr, l, r);

      // if pos is same as k
      if (pos - l == k - 1) {
        return arr[pos];
      }

      if (pos - l > k - 1) {
        return kthSmallestEle(arr, l, pos - 1, k);
      }

      return kthSmallestEle(arr, pos + 1, r, k - pos + l - 1);
    }
    return Integer.MAX_VALUE;
  }

  private static int partition(Integer[] A, int left, int right) {
    int x = A[right], i = left;
    for (int j = left; j <= right - 1; j++) {
      if (A[j] <= x) {
        // swap A[i] and A[j]
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        i++;
      }
    }

    // swap A[i] and A[right]
    int tmp = A[i];
    A[i] = A[right];
    A[right] = tmp;

    return i;

  }
}
