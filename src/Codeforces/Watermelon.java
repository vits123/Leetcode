package Codeforces;

import java.util.Scanner;

public class Watermelon {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int w = in.nextInt();

    if (w > 2 && w % 2 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}
