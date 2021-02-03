package geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Reverse string using ListIterator or ArrayList object
 */
public class StringReverse2 {

  public static void main(String[] args) {
    String s1 = "Geeks for Geeks";
    char[] s1arr = s1.toCharArray();

    List<Character> trail1 = new ArrayList<>();
    for (char c : s1arr) {
      trail1.add(c);
    }

    Collections.reverse(trail1);
    ListIterator liter = trail1.listIterator();

    while (liter.hasNext()) {
      System.out.print(liter.next());
    }

  }
}
