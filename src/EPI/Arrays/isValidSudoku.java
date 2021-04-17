package EPI.Arrays;
/*
    Problem 5.17 - Sudoku checker problem
    Time complexity - O(n^2), Space complexity - O(n)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isValidSudoku {

  public static boolean isValidPuzzle(List<List<Integer>> partialAssignment) {
    // Check row constraints
    for (int i = 0; i < partialAssignment.size(); ++i) {
      if (hasDuplicate(partialAssignment, i, i + 1, 0, partialAssignment.size())) {
        return false;
      }
    }

    // Check column constraints
    for (int j = 0; j < partialAssignment.size(); ++j) {
      if (hasDuplicate(partialAssignment, 0, partialAssignment.size(), j, j + 1)) {
        return false;
      }
    }

    // Check region constraints
    int regionSize = (int) Math.sqrt(partialAssignment.size());
    for (int I = 0; I < regionSize; ++I) {
      for (int J = 0; J < regionSize; ++J) {
        if (hasDuplicate(partialAssignment, regionSize * I, regionSize * (I + 1), regionSize * J,
            regionSize * (J + 1))) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean hasDuplicate(List<List<Integer>> partialAssignment, int startRow,
      int endRow, int startCol, int endCol) {
    List<Boolean> isPresent = new ArrayList<>(
        Collections.nCopies(partialAssignment.size() + 1, false));

    for (int i = startRow; i < endRow; ++i) {
      for (int j = startCol; j < endCol; ++j) {
        if (partialAssignment.get(i).get(j) != 0 && isPresent
            .get(partialAssignment.get(i).get(j))) {
          return true;
        }
        isPresent.set(partialAssignment.get(i).get(j), true);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    List<List<Integer>> board = asList(asList(5, 3, 0, 0, 7, 0, 0, 0, 0),
        asList(6, 0, 0, 1, 9, 5, 0, 0, 0), asList(0, 9, 8, 0, 0, 0, 0, 6, 0),
        asList(8, 0, 0, 0, 6, 0, 0, 0, 3), asList(4, 0, 0, 8, 0, 3, 0, 0, 1),
        asList(7, 0, 0, 0, 2, 0, 0, 0, 6), asList(0, 6, 0, 0, 0, 0, 2, 8, 0),
        asList(0, 0, 0, 4, 1, 9, 0, 0, 5), asList(0, 0, 0, 0, 8, 0, 0, 7, 9));

    System.out.println("Is Sudoku Valid ? " + isValidSudoku.isValidPuzzle(board));
  }

  private static <T> List<T> asList(T... items) {
    List<T> list = new ArrayList<T>();
    for (T item : items) {
      list.add(item);
    }
    return list;
  }
}
