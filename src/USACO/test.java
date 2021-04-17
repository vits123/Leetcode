package USACO;

/*
ID: rahanev1
LANG: JAVA
TASK: test
*/

import java.io.*;
import java.util.*;

public class test {

  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("test.in"));
    // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
    // Get line, break into tokens
    int i1 = Integer.parseInt(st.nextToken());
    int i2 = Integer.parseInt(st.nextToken());
    out.println(i1 + i2);
    out.close();
  }
}
