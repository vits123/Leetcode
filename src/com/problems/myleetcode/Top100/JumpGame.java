package com.problems.myleetcode.Top100;

/**
 * Leetcode 55(Medium) : JumpGame Problem, Time - O(n), Space - O(1), Greedy solution
 */
public class JumpGame {

  public boolean canJump(int[] nums) {
    int lastGoodIndex = nums.length - 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      if (i + nums[i] >= lastGoodIndex) {
        lastGoodIndex = i;
      }
    }
    return lastGoodIndex == 0;
  }

  public static void main(String[] args) {
    int[] nums = {2, 0, 0};
    JumpGame jo = new JumpGame();
    System.out.println(jo.canJump(nums));
  }
}
