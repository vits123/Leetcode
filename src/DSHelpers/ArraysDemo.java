package DSHelpers;

import java.util.Arrays;

/**
 * java.util.Arrays class provides several static methods that can be used to perform tasks like
 * fill array, sort array, search in array etc.
 */
public class ArraysDemo {

  public static void main(String[] args) {

    // static <T> List<T> asList() - This method returns fixed size list backed by specified arrays
    int[] arr1 = {10, 20, 15, 22, 35};
    System.out.println("Integer array as List -> " + Arrays.asList(arr1));

    Arrays.sort(arr1);
    int key = 22;
    System.out.println("Key found at index -> " + Arrays.binarySearch(arr1, key));

    // compare(arr1, arr2) - compare 2 arrays lexicographically
    int[] arr2 = {10, 15, 22};
    System.out.println("Arrays on comparison " + Arrays.compare(arr1, arr2));

    // copyOf(originalArray, newLength) - It copies the specified array, truncating or padding with default value if necessary so copy has specified length.
    System.out.println("arr1-> " + Arrays.toString(arr1));
    System.out.println("After copyOf -> " + Arrays.toString(Arrays.copyOf(arr1, 10)));

    // copyOfRange(originalArray, fromIndex, endIndex) - This method copies specified range of array into new arrays.
    System.out.println("arr1 -> " + Arrays.toString(arr1));
    System.out
        .println(
            "New array using copyOfRange -> " + Arrays.toString(Arrays.copyOfRange(arr1, 1, 3)));

    // static boolean deepEquals(Object[] a1, Object[] a2) - returns true if 2 arrays are deeply equal to one another

    int intArr[][] = {{10, 20, 15, 22, 35}};

    // Get the second Arrays
    int intArr1[][] = {{10, 15, 22}};

    System.out
        .println("Array comparison using deepEquals -> " + Arrays.deepEquals(intArr, intArr1));

    // static int deepHashCode(Object[] a) - This method returns a hash code based on deep contents of specified arrays.
    int arr3[][] = {{10, 20, 15, 22, 35, 50}};
    System.out.println("deepHashCode -> " + Arrays.deepHashCode(arr3));

    // fill(originalArray, fillValue) - This method assigns fillValue to each index of this array.
    int fillKey = 10;
    Arrays.fill(arr2, fillKey);
    System.out.println("New Array after fill -> " + Arrays.toString(arr2));

    // mismatch(array1, array2) - This method finds and returns the index of the first unmatched element between 2 arrays.
    System.out.println("First Mismatched element at index -> " + Arrays.mismatch(arr1, arr2));
  }

}
