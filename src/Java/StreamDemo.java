package Java;

/**
 * Stream API is used to process collections of objects. A stream is a sequence of objects that
 * supports various methods which can be pipelined to produce the desired result Stream is not a
 * data structure instead it takes data from arrays, I/O channels or Collections. Streams don't
 * change the original data structure.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1. map - This method is used to return a stream consisting of results of applying the given
 * function to the elements of this stream 2. filter - This method is used to select elements as per
 * the Predicate passed as argument. 3. sorted - This method is used to sort the stream. 4. Reduce -
 * This method is used to reduce the elements of a stream to a single value.
 */

public class StreamDemo {

  public static void main(String[] args) {
    List<Integer> number = Arrays.asList(2, 3, 4, 5, 4);
    List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
    System.out.println("Squaring the original list: " + square);

    List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
    List<String> result = names.stream().filter(s -> s.startsWith("S"))
        .collect(Collectors.toList());
    System.out.println("names after filter :" + result);

    List<String> show = names.stream().sorted().collect(Collectors.toList());
    System.out.println("After sorting: " + show);

    Set<Integer> sqSet = number.stream().map(x -> x * x).collect(Collectors.toSet());
    System.out.println("sqSet: " + sqSet);

    int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
    System.out.println(even);
  }

}
