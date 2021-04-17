package CTCI.chapter1;

public class Common {

  public static int[] buildCharFrequencyTable(String phrase) {
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
    for (char c : phrase.toCharArray()) {
      int x = getCharNumber(c);

      if (x != -1) {
        table[x]++;
      }
    }
    return table;
  }

  public static int getCharNumber(Character c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int A = Character.getNumericValue('A');
    int Z = Character.getNumericValue('Z');

    int val = Character.getNumericValue(c);

    if (a <= val && val <= z) {
      return val - a;
    } else if (A <= val && val <= Z) {
      return val - A;
    }
    return -1;
  }
}
