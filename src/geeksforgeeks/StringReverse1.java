package geeksforgeeks;

/**
 * Reverse a string using getBytes() method
 */
public class StringReverse1 {

  public static void main(String[] args) {
    String input = "Jake";

    byte[] str1 = input.getBytes();

    byte[] result = new byte[str1.length];

    for (int i = 0; i < str1.length; i++) {
      result[i] = str1[str1.length - i - 1];
    }

    System.out.println("Reversed String: " + new String(result));

  }
}
