package geeksforgeeks;

/**
 * Write a function to rotate a given array to left of size n by d elements
 */

public class RotateArray {

  void leftRotate(int[] a, int d, int n) {
    for (int i = 0; i < d; i++) {
      leftRotateByOne(a, n);
    }
  }

  void leftRotateByOne(int[] a, int n) {
    int temp, i;
    temp = a[0];
    for (i = 0; i < n - 1; i++) {
      a[i] = a[i + 1];
    }
    a[i] = temp;
  }

  void printArray(int[] a, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(a[i] + " ");
    }
  }


  public static void main(String[] args) {
    RotateArray rotate = new RotateArray();
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    rotate.leftRotate(arr, 2, 7);
    rotate.printArray(arr, 7);
  }

}

