package EPI;

/**
 * EPI 4.4
 * Algorithm: Suppose we flip the bit at index k1 and flip the bit at index k2 , k1 > k2.
 * Then the absolute value of the difference between the original integer & the new one is 2^k1 -
 * 2^k2. To minimize this we should make k1 as small as possible and k2 as close to k1. In summary,
 * correct approach is to swap the two rightmost consecutive bits that differ.
 * Time complexity:-O(n)
 * Space complexity:- O(1)
 */

public class ClosestIntegerSameWeight {

  public static long closestIntSameBitCount(long x) {
    final int NUM_UNSIGNED_BITS = 63;
    for (int i = 0; i < NUM_UNSIGNED_BITS - 1; ++i) {
      if ((((x >>> i) & 1) != ((x >>> (i + 1)) & 1))) {
        x ^= (1L << i) | (1L << (i + 1));  // Swaps bit(i) & bit(i+1)
        return x;
      }
    }
    throw new IllegalArgumentException("All bits of x are 0 or 1");
  }

  public static void main(String[] args) {
    long x = 92;
    long answer = ClosestIntegerSameWeight.closestIntSameBitCount(x);
    System.out.println(answer);
  }
}
