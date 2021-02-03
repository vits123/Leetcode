package geeksforgeeks;

public class ReverseStringWords {

  public static void main(String[] args) {
    String s = "i.like.this.program.very.much";
    ReverseStringWords obj3 = new ReverseStringWords();
    char[] p = obj3.reverseWords(s.toCharArray());
    System.out.println(p);
  }

  private char[] reverseWords(char[] s) {
    int start = 0;
    for (int end = 0; end < s.length; end++) {
      // If we found space then we reverse previous word
      if (s[end] == '.') {
        reverse(s, start, end - 1);
        start = end + 1;
      }
    }
    reverse(s, start, s.length - 1);  // reverse last word
    reverse(s, 0, s.length - 1); // reverse whole string
    return s;
  }

  private void reverse(char[] str, int start, int end) {
    char temp;
    while (start <= end) {
      temp = str[start];
      str[start] = str[end];
      str[end] = temp;
      start++;
      end--;
    }
  }
}
