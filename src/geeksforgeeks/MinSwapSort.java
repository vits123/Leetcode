package geeksforgeeks;

import java.util.Arrays;
import java.util.HashMap;

public class MinSwapSort {

  public static void main(String[] args) {
    int[] a = {4,3,2,1};
    int N = a.length;
    System.out.println(new MinSwapSort().minSwaps(a, N));
  }

  private int minSwaps(int[] a, int N) {
    int ans = 0;

    int[] tmp = Arrays.copyOfRange(a, 0, N);

    HashMap<Integer, Integer> h = new HashMap<>();

    Arrays.sort(tmp); // {1,2,3,4}

    for (int i = 0; i < N; i++) {
      h.put(a[i], i);
    }

    for (int i = 0; i < N; i++) {
      if (a[i] != tmp[i]) {
        ans++;
        int init = a[i];
        swap(a, i, h.get(tmp[i]));

        h.put(init, h.get(tmp[i]));
        h.put(tmp[i], i);
      }
    }
    return ans;
  }

  private void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
