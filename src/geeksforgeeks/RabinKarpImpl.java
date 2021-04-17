package geeksforgeeks;

/**
 * Naive string matching algorithm slides the pattern one by one and checks characters at current
 * shift. If all characters match then prints the match. Rabin Karp also slides the pattern one by
 * one but matches the hash value of pattern with the hash value of current substring of text. and
 * if hash value matches then only starts matching individual characters.
 */

public class RabinKarpImpl {

  // no. of characters in input alphabet
  public final static int d = 256;

  public static void main(String[] args) {
    String txt = "GEEKSFORGEEKS";
    String pat = "GEEK";
    int q = 13; // prime number
    search(pat, txt, q);
  }

  private static void search(String pat, String txt, int q) {
    int m = pat.length(), n = txt.length();
    int i, j;
    int p = 0; // hash value for pattern
    int t = 0; // hash value for txt
    int h = 1;

    for (i = 0; i < m - 1; i++) {
      h = (h * d) % q;
    }

    // Calculate hash value of pattern and first window of text
    for (i = 0; i < m; i++) {
      p = (d * p + pat.charAt(i)) % q;
      t = (d * t + txt.charAt(i)) % q;
    }

    // Slide the pattern over text one by one
    for (i = 0; i <= n - m; i++) {
      // check the hash values of current window of text and pattern. If matches then match character by character
      if (p == t) {
        for (j = 0; j < m; j++) {
          if (txt.charAt(i + j) != pat.charAt(j)) {
            break;
          }
        }

        if (j == m) {
          System.out.println("Pattern found at index " + i);
        }
      }

      // calculate hash value for next window of text
      if (i < n - m) {
        t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;

        if (t < 0) {
          t = t + q;
        }
      }

    }


  }
}
