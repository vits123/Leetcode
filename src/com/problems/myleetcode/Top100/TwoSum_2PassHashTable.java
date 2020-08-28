/*
   Time complexity: O(n)
   Space complexity: O(n)
   Approach: Two-pass Hash Table

   We reduce the look up time from O(n) to O(1)- Hash table is built exactly for this
   In 1st iteration we add each elements's value and it's index to table. In 2nd iteration we check if each element's
   complement (target - nums[i]) exists in the table
   Beware that complement must not be nums[i] itself...


 */

package com.problems.myleetcode.Top100;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_2PassHashTable {

  public int[] twoSum(int[] nums, int target) {
    // Define HashMap
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[]{i, map.get(complement)};
      }
    }

    throw new IllegalArgumentException("No two sum solution");
  }

  public static void main(String[] args) {
    TwoSum_2PassHashTable twoSumHT = new TwoSum_2PassHashTable();
    int[] output1 = twoSumHT.twoSum(new int[]{2, 7, 11, 15}, 9);
    if (output1.length == 2) {
      System.out.println(output1[0] + " " + output1[1]);
    }
  }
}
