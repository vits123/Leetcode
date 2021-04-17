package data_structure.tree;

import java.util.Scanner;

public class IterativeBinarySearch {

  public int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
    int index = Integer.MAX_VALUE;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (key > sortedArray[mid]) {
        low = mid + 1;
      } else if (key < sortedArray[mid]) {
        high = mid - 1;
      } else if (key == sortedArray[mid]) {
        index = mid;
        break;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int[] arr = {4, 6, 8, 30, 60, 65, 67, 80, 500};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter key you want to search");
    int key = scanner.nextInt();
    int low = 0, high = arr.length - 1;
    IterativeBinarySearch bsIterative = new IterativeBinarySearch();
    System.out
        .println("Index of key is: " + bsIterative.runBinarySearchIteratively(arr, key, low, high));
  }
}
