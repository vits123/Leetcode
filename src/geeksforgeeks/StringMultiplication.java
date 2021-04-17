package geeksforgeeks;

/**
 * Multiply 2 arbitrary precision integers represented as strings
 */
public class StringMultiplication {

  public static void main(String[] args) {
    String num1 = "123", num2 = "456";
    String tmp1 = num1, tmp2 = num2;

    // Check if one string is negative
    if (num1.charAt(0) == '-' && num2.charAt(0) != '-') {
      num1 = num1.substring(1);
    } else if (num1.charAt(0) != '-' && num2.charAt(0) == '-') {
      num2 = num2.substring(1);
    } else if (num1.charAt(0) == '-' && num2.charAt(0) == '-') {
      num1 = num1.substring(1);
      num2 = num2.substring(1);
    }

    String s1 = new StringBuffer(num1).reverse().toString();
    String s2 = new StringBuffer(num2).reverse().toString();

    int[] m = new int[s1.length() + s2.length()];

    // Go from right to left in num1
    for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s2.length(); j++) {
        m[i + j] = m[i + j] + (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
      }
    }

    String product = new String();

    for (int i = 0; i < m.length; i++) {
      int digit = m[i] % 10;
      int carry = m[i] / 10;

      if (i + 1 < m.length) {
        m[i + 1] = m[i + 1] + carry;
      }
      product = digit + product;
    }

    // Ignore 0's from the right
    while (product.length() > 1 && product.charAt(0) == '0') {
      product = product.substring(1);
    }

    // CHeck if one string is negative
    if (tmp1.charAt(0) == '-' && tmp2.charAt(0) != '-') {
      product = new StringBuffer(product).insert(0, '-').toString();
    } else if (tmp1.charAt(0) != '-' && tmp2.charAt(0) == '-') {
      product = new StringBuffer(product).insert(0, '-').toString();
    } else if (tmp1.charAt(0) == '-' && tmp2.charAt(0) == '-') {
      product = product;
    }

    System.out.println("Product of 2 numbers is : " + product);

  }
}
