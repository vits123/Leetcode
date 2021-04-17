package com.problems.myleetcode.Top100;

/**
 * Remove duplicates from sorted array and return length of final array Constraint: Do it using
 * in-place algorithm
 * Time complexity: O(n)
 * Space complexity: O(1)
 * Approach:  Use 2 pointers i and j such that j will move fast to skip duplicates and i will keep track of distinct elements.
 */


public class SortedArrayDuplicate {

  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int i = 0;   // i is slow pointer and j is fast pointer
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {

        // put nums[j] at nums[++i]
        nums[++i] = nums[j];
      }
    }
    return i + 1;
  }

  public static void main(String[] args) {
    SortedArrayDuplicate dup = new SortedArrayDuplicate();
    int res = dup.removeDuplicates(new int[]{1, 1, 1, 5, 10, 10, 30, 30});
    System.out.println("Final length = " + res);
  }

}
