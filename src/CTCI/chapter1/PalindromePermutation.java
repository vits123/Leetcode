package CTCI.chapter1;

public class PalindromePermutation {

  public static void main(String[] args) {
    String input = "Rats live on no evil star";
    System.out.println(isPermutationOfPalindrome(input));
  }

  public static boolean isPermutationOfPalindrome(String input) {
    int[] table = Common.buildCharFrequencyTable(input);
    return checkMaxOneOdd(table);
  }

  public static boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;
    for (int cnt : table) {
      if (cnt % 2 == 1) {
        if (foundOdd) {
          return false;
        }
        foundOdd = true;
      }
    }

    return true;
  }
}
