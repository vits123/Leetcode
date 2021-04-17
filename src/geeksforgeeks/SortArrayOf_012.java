package geeksforgeeks;
/*
     Time - O(n), Space - O(1)
*/
public class SortArrayOf_012 {

  public static void main(String[] args) {
    int[] A = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    sort012(A);
    print(A);
  }

  private static void print(int[] A) {
    for (int e : A) {
      System.out.print(e + " ");
    }
  }

  private static void sort012(int[] A) {
    int l = 0, mid = 0, h = A.length - 1;
    int temp = 0;

    while (mid <= h) {
      switch (A[mid]) {
        case 0: {
          temp = A[l];
          A[l] = A[mid];
          A[mid] = temp;
          l++;
          mid++;
          break;
        }

        case 1: {
          mid++;
          break;
        }

        case 2: {
          temp = A[mid];
          A[mid] = A[h];
          A[h] = temp;
          h--;
          break;
        }

      }
    }
  }
}
