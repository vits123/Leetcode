package geeksforgeeks;

/**
 * Time - O(n)
 */
public class MinMaxInArray {

  static class Pair {

    int min, max;
  }

  public static void main(String[] args) {
    int[] arr = {1000, 11, 445, 1, 330, 3000};
    int N = arr.length;
    Pair minmax = getMinMax(arr, N);
    System.out.println("Min = " + minmax.min);
    System.out.println("Max = " + minmax.max);
  }

  private static Pair getMinMax(int[] arr, int n) {
    Pair pair = new Pair();
    int i;

    // n is even
    if (n % 2 == 0) {
      if (arr[0] > arr[1]) {
        pair.max = arr[0];
        pair.min = arr[1];
      } else {
        pair.max = arr[1];
        pair.min = arr[0];
      }
      i = 2;
    } else {
      pair.max = arr[0];
      pair.min = arr[0];
      i = 1;
    }

    while (i < n - 1) {
      if (arr[i] > arr[i + 1]) {
        if (arr[i] > pair.max) {
          pair.max = arr[i];
        }
        if (arr[i + 1] < pair.min) {
          pair.min = arr[i + 1];
        }
      } else {
        if (arr[i + 1] > pair.max) {
          pair.max = arr[i + 1];
        }
        if (arr[i] < pair.min) {
          pair.min = arr[i];
        }
      }
      i += 2;
    }
    return pair;
  }
}
