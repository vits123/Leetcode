package Codeforces;

import java.util.Scanner;

public class Problem112A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s = s.toLowerCase();
    String s2 = sc.next();
    s2 = s2.toLowerCase();

    int result = s.compareTo(s2);

    if (result < 0) {
      System.out.println("-1");
    } else if (result > 0) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }

  }
}
