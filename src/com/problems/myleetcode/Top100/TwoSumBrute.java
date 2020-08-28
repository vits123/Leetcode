/*
    Time complexity: O(n^2)
    Space complexity: O(1)
    Example: nums[2,7,11,15], target = 9
    Approach: Loop through each element x and find if there is another value equals to target - x
 */

package com.problems.myleetcode.Top100;

public class TwoSumBrute {

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          // ith & jth element adds to target; return index for i and j as array
          return new int[]{i, j};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  // we need to call the method with arguments to test the output
  public static void main(String[] args) {
    TwoSumBrute twoSumBrute = new TwoSumBrute();
    int[] output = twoSumBrute.twoSum(new int[]{2, 7, 11, 15}, 9);
    if (output.length == 2) {
      System.out.println(output[0] + " " + output[1]);
    }
  }


}
