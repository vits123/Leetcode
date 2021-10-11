package packt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateCharactersCount {

  // Solution 1
  public static Map<Character, Integer> countDuplicateChars(String str) {
    Map<Character, Integer> res = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      res.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
    }
    return res;
  }

  // Solution 2
  public static Map<Character, Long> countDupsUsingStream(String str) {
    Map<Character, Long> res = str.chars().mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c,
            Collectors.counting()));
    return res;
  }


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter input string");
    String input = s.next();

    Map<Character, Integer> res = DuplicateCharactersCount.countDuplicateChars(input);
    Map<Character, Long> res2 = DuplicateCharactersCount.countDupsUsingStream(input);
    System.out.println(res);
    System.out.println(res2);
  }
}
