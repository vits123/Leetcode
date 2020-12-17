package EPI;

/**
 * EPI 4.5 Algorithm -> Shift & add method
 * <p>
 * E.g  13(1101)(Multiplicand) -> x 9(1001)(Multiplier) -> y In the first iteration since the LSB of
 * 13 is 1, we set the result to 1001. The 2nd bit of 1101 is 0 so we move to the next bit. 3rd bit
 * is 1 so we shift 1001 to left by 2 to obtain 100100 which we add to 1001 to get 101101. The 4th &
 * final bit of 1101 is 1 so we shift 1001 to left by 3 to obtain 1001000 which we add to 101101 to
 * get 1110101 = 117 The time complexity of addition is O(n) where n is number of bits needed to
 * represent the operands. Since we do n additions to perform a single multiplication total time
 * taken is O(n^2)
 */
public class ProductWIthoutArithmeticOperators {

  public static long multiply(long x, long y) {
    long sum = 0;
    while (x != 0) {
      // Examine each bit of x
      if ((x & 1) != 0) {
        sum = add(sum, y);
      }
      x >>>= 1;
      y <<= 1;
    }
    return sum;
  }

  private static long add(long sum, long y) {
    while (y != 0) {
      long carry = sum & y;
      sum = sum ^ y;
      y = carry << 1;
    }
    return sum;
  }

  public static void main(String[] args) {
    long x = 10, y = 3;
    System.out.println(ProductWIthoutArithmeticOperators.multiply(x, y));
  }

}
