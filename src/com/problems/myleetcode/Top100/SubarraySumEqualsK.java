package com.problems.myleetcode.Top100;
/**
 * Time - O(n), Space - O(n)
 */

import java.util.HashMap;

public class SubarraySumEqualsK {

  public static int subarraySum(int[] nums, int k) {
    int count = 0, sum = 0;
    HashMap<Integer, Integer> mp = new HashMap<>();
    mp.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (mp.containsKey(sum - k)) {
        count += mp.get(sum - k);
      }
      mp.put(sum, mp.getOrDefault(sum, 0) + 1);
    }
    return count;
  }

  public static void main(String[] args) {
    int[] A = {3, 4, 7, 2, -3, 1, 4, 2};
    int k = 7;
    System.out.println(SubarraySumEqualsK.subarraySum(A, k));
  }
}
