package CTCI.chapter1;
/*
    Time complexity - O(n)
    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    cannot use additional data structures?
*/

import java.util.Scanner;

public class IsUniqueCharacters {

  public static boolean isUnique(String st) {
    int checker = 0;
    for (int i = 0; i < st.length(); i++) {
      int bitAtIndex = st.charAt(i) - 'a';
      if ((checker & (1 << bitAtIndex)) > 0) {
        return false;
      }
      checker = checker | (1 << bitAtIndex);
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter String");
    String input = s.next();
    System.out.println("String has unique chars or not ? " + IsUniqueCharacters.isUnique(input));
  }
}
