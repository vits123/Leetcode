package iCamp;

/**
 * Time - O(n), Space - O(1)
 * Two pointer approach
 */
public class ReplaceEvenNumberDemo {

  public static void main(String[] args) {
    int[] arr = {2, 4, 1, 0, 3, -1, -1, -1};
    cloneEvenNumbers(arr);
    for (int e : arr) {
      System.out.print(e + " ");
    }
  }

  private static int[] cloneEvenNumbers(int[] a) {
    if (a == null || a.length == 0) {
      return a;
    }

    int end = a.length, i = getLastNumber(a);

    while (i >= 0) {
      if (a[i] % 2 == 0) {
        a[--end] = a[i];
      }
      a[--end] = a[i];
      i--;
    }
    return a;
  }

  private static int getLastNumber(int[] a) {
    int i = a.length - 1;
    while (i >= 0 && a[i] == -1) {
      i--;
    }
    return i;
  }
}
