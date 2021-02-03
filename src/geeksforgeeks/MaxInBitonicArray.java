package geeksforgeeks;

/**
 * Time complexity - O(n)
 */
public class MaxInBitonicArray {

  public static int findMax(int[] arr, int low, int high) {
    if (low == high) {
      return arr[low];
    }

    if (high == low + 1) {
      if (arr[low] >= arr[high]) {
        return arr[low];
      } else {
        return arr[high];
      }
    }

    int mid = (low + high) / 2;

    if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
      return arr[mid];
    }

    if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
      return findMax(arr, low, mid - 1); // Max is in left portion
    } else {
      return findMax(arr, mid + 1, high);
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 20, 23, 10, 8, 1};
    int max = MaxInBitonicArray.findMax(arr, 0, arr.length - 1);
    System.out.println(max);
  }
}
