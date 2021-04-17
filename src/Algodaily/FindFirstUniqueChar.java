package Algodaily;
/*
    Return first unique character from a given string
    Time - O(n), Space - O(n)
 */

import java.util.HashMap;

public class FindFirstUniqueChar {

  public static char firstUniqueChar(String s) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); ++i) {
      if (map.containsKey(s.charAt(i))) {
        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
      } else {
        map.put(s.charAt(i), 1);
      }
    }

    // traverse and find a character in map whose value is 1
    for (int i = 0; i < s.length(); ++i) {
      if (map.get(s.charAt(i)) == 1) {
        return s.charAt(i);
      }
    }

    return '\0';
  }

  public static void main(String[] args) {
    String st = "aannnnnnnff";
    char fuchar = FindFirstUniqueChar.firstUniqueChar(st);
    System.out.println("First unique character in given string is: " + fuchar);
  }
}
