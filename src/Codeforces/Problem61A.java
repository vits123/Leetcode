package Codeforces;

import java.util.Scanner;

public class Problem61A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String no1 = sc.nextLine();
    String no2 = sc.next();
    String res = "";

    for (int i = 0; i < no1.length(); i++) {
      if (Integer.parseInt(no1.charAt(i) + "") == Integer.parseInt(no2.charAt(i) + "")) {
        res = res + "0";
      } else {
        res = res + "1";
      }
    }
    System.out.println(res);
  }

}
