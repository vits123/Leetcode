package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Print all duplicate characters of a given string
 * Time complexity - O(n logn)
 * Space complexity - O(n)
 */
public class DuplicateChars {

  public static void getDuplicates(String str) {
    HashMap<Character, Integer> count = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if (!count.containsKey(str.charAt(i))) {
        count.put(str.charAt(i), 1);
      } else {
        count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
      }
    }

    // print duplicates now
    for (Map.Entry ele : count.entrySet()) {
      char key = (char) ele.getKey();
      int value = (int) ele.getValue();

      if (value > 1) {
        System.out.println(key + ", Count = " + value);
      }

    }

  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Input String:");
    String s1 = s.next();
    DuplicateChars.getDuplicates(s1);
  }
}
