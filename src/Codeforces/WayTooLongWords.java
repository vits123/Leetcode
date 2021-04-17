package Codeforces;

import java.util.Scanner;

public class WayTooLongWords {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double len = sc.nextInt();
    String in = null;

    for (int i = 0; i <= len; i++) {
      in = sc.nextLine();
      if (in.length() > 10) {
        System.out.print(in.charAt(0));
        System.out.print(in.length() - 2);
        System.out.println(in.charAt(in.length() - 1));
      } else {
        System.out.println(in);
      }
    }
  }
}
