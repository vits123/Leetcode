package DSHelpers;

import java.math.BigDecimal;

/**
 * BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding,
 * comparison, format conversion and hashing This class can handle very large and very small
 * floating point numbers with great precision but compensating with the time complexity a bit. A
 * BigDecimal consists of a random precision integer unscaled value and a 32 bit integer scale. If
 * scale >= 0, the scale is the number of digits to the right of decimal point. If scale < 0, the
 * unscale value of number is multiplied by 10 ^ (-scale). The two java primitive types (double and
 * float) are floating point numbers, which is stored as a binary representation of a fraction and a
 * exponent. Other primitive types (except boolean) are fixed point numbers. Unlike fixed point
 * numbers, floating point numbers will most of the time return an answer with small error around
 * (10 ^ -19). BigDecimal helps return correct precision results.
 */
public class BigDecimalDemo {

  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal("124567890.0987654321");
    BigDecimal bd2 = new BigDecimal("987654321.123456789");

    bd1 = bd1.add(bd2);
    System.out.println("BigDecimal1 = " + bd1);

    bd1 = bd1.multiply(bd2);
    System.out.println("BigDecimal1 = " + bd1);

    bd1 = bd1.subtract(bd2);
    System.out.println("BigDecimal1 = " + bd1);

    bd1 = bd1.divide(bd2);
    System.out.println("BigDecimal1 = " + bd1);

    bd1 = bd1.pow(2);
    System.out.println("BigDecimal1 = " + bd1);

    bd1 = bd1.negate();
    System.out.println("BigDecimal1 = " + bd1);

    // BigDecimal valueOf(long val)
    Long ln = new Long("745812345678");
    BigDecimal bn = BigDecimal.valueOf(ln);

    System.out.println("Converted BigDecimal value is : " + bn);

    // BigDecimal valueOf(double val)
    Double d = new Double("785.254");
    BigDecimal b = BigDecimal.valueOf(d);
    System.out.println("Converted value is : " + b);

    // java.math.BigDecimal.valueOf(long unscaledVal, int scale) - This method returns BigDecimal whose value is unscaledVal * 10 ^ -scale
    Long ln1 = new Long("789654");
    BigDecimal b1 = BigDecimal.valueOf(ln1, 3);
    System.out.println("Scaled value is : " + b1);

    // BigDecimal byteValueExact() - converts the bigdecimal to byte and checks for lost information. Any bigdecimal value greater than 127 or less than -128 will generate exception
    BigDecimal b3;
    byte bt;

    b3 = new BigDecimal("47");
    bt = b3.byteValueExact();

    System.out.println("Exact byte value of " + b3 + " is : " + bt);


  }
}
