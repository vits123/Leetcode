package geeksforgeeks;

import java.util.HashMap;

public class IsAnAnagramUsingHashMap {

  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "cbad";

    System.out.println(anagramCheck(s1, s2));
  }

  private static boolean anagramCheck(String s1, String s2) {
    HashMap<Character, Integer> hmap1 = new HashMap<>();
    HashMap<Character, Integer> hmap2 = new HashMap<>();

    char[] s1Arr = s1.toCharArray();
    char[] s2Arr = s2.toCharArray();

    for (int i = 0; i < s1Arr.length; i++) {
      if (hmap1.get(s1Arr[i]) == null) {
        hmap1.put(s1Arr[i], 1);
      } else {
        Integer c = (int) hmap1.get(s1Arr[i]);
        hmap1.put(s1Arr[i], ++c);
      }
    }

    for (int j = 0; j < s2Arr.length; j++) {
      if (hmap2.get(s2Arr[j]) == null) {
        hmap2.put(s2Arr[j], 1);
      } else {
        Integer d = (int) hmap2.get(s2Arr[j]);
        hmap2.put(s2Arr[j], ++d);
      }
    }

    if (hmap1.equals(hmap2)) {
      return true;
    }

    return false;
  }
}
