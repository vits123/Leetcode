package USACO;
/*
 ID: rahanev1
TASK: ride
LANG: JAVA
*/

import java.io.*;

public class ride {

  public static void main(String[] args) throws IOException {
    BufferedReader b = new BufferedReader(new FileReader("ride.in"));
    PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")), true);

    String comet = b.readLine();
    String grp = b.readLine();

    if (mod47(comet) == mod47(grp)) {
      w.println("GO");
    } else {
      w.println("STAY");
    }

  }

  private static int mod47(String s) {
    int res = 1;
    for (int i = 0; i < s.length(); i++) {
      res *= (s.charAt(i) - 'A' + 1);
    }
    return res % 47;
  }
}
