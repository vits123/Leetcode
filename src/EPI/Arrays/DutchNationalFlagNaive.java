package EPI.Arrays;
/**
 * Time complexity - O(n ** 2) Space complexity - O(1)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DutchNationalFlagNaive {

  public enum Color {RED, WHITE, BLUE}

  public static void dutchFlagPartition(int pivotIndex, List<Color> A) {
    Color pivot = A.get(pivotIndex);
    // First pass: group elements smaller than pivot
    for (int i = 0; i < A.size(); ++i) {
      for (int j = i + 1; j < A.size(); ++j) {
        if (A.get(j).ordinal() < pivot.ordinal()) {
          Collections.swap(A, i, j);
          break;
        }
      }
    }

    // Second pass: group elements larger than pivot
    for (int i = A.size() - 1; i >= 0; --i) {
      for (int j = i - 1; j >= 0; --j) {
        if (A.get(j).ordinal() > pivot.ordinal()) {
          Collections.swap(A, i, j);
          break;
        }
      }
    }
    //System.out.println(A);
  }

  public static void main(String[] args) {
    List<Color> colors = new ArrayList<>();
    colors.add(Color.RED);
    colors.add(Color.WHITE);
    colors.add(Color.BLUE);
    int pivotIndex = 1;
    dutchFlagPartition(pivotIndex, colors);
  }
}
