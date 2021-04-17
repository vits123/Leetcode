package com.problems.myleetcode.Top100;

/**
 * I - 1 V - 5 X - 10 XL - 40 L - 50 C - 100 D - 500 CM - 900 M - 1000
 */
public class IntegerToRoman {

  public static void main(String[] args) {
    int number = 100;
    System.out.println(intToRoman(number));
  }

  // function to convert decimal to Roman numeral
  private static String intToRoman(int number) {
    // Storing roman values of digits from 0-9 when placed at different places
    String m[] = {"", "M", "MM", "MMM"};
    String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    // Conversion to Roman
    String thousands = m[number / 1000];
    String hundreds = c[(number % 1000) / 100];
    String tens = x[(number % 100) / 10];
    String ones = i[number % 10];

    String ans = thousands + hundreds + tens + ones;
    return ans;
  }

}
