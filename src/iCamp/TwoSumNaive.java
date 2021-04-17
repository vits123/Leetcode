package iCamp;

import java.util.Scanner;

public class TwoSumNaive {

  public static IntPair twoSum(int[] A, int target) {
    if (A == null) {
      return null;
    }

    for (int i = 0; i < A.length; i++) {
      for (int j = i + 1; j < A.length; j++) {
        if (A[i] + A[j] == target) {
          return new IntPair(A[i], A[j]);
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] A = {6, 3, 5, 2, 1, 7};
    Scanner s = new Scanner(System.in);
    System.out.println("Enter target");
    int t = s.nextInt();
    System.out.println(TwoSumNaive.twoSum(A, t));
  }
}


