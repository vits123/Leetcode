package Algodaily;

/**
 * Reverse string using toCharArray() and swapping characters
 */
public class StringReverseUsingSwap {

  public static void main(String[] args) {
    String s = "Jake";

    char[] schar = s.toCharArray();
    int left, right = schar.length - 1;

    for (left = 0; left < right; left++, right--) {
      char temp = schar[left];
      schar[left] = schar[right];
      schar[right] = temp;
    }

    for (char c : schar) {
      System.out.print(c);
    }
  }
}
