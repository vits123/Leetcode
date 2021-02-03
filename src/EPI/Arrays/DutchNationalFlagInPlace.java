package EPI.Arrays;

/**
 * Leetcode 75 Time complexity - O(n)
 * Space complexity - O(1)
 */

public class DutchNationalFlagInPlace {

  public static void sortColors(int[] nums) {
    int low = 0, mid = 0;
    int high = nums.length - 1;

    while (mid <= high) {
      switch (nums[mid]) {
        case 0: {
          swap(nums, low, mid);
          low++;
          mid++;
          break;
        }
        case 1: {
          mid++;
          break;
        }
        case 2: {
          swap(nums, mid, high);
          high--;
          break;
        }
      }
    }

    for (int i : nums) {
      System.out.print(i + " ");
    }
  }

  private static void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }

  public static void main(String[] args) {
    int[] nums = {0, 2, 2, 1, 1, 0};
    DutchNationalFlagInPlace.sortColors(nums);
  }
}
