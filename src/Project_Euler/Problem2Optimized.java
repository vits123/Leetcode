package Project_Euler;

/*
    Every 3 rd number in Fibonacci is even number. so we can only add even numbers instead of giving condition for
    even check

    1 1  2  3 5  8  13 21  44 ...

    a = b
    b = c

    a -> 1, b -> 2

    a -> b + c, b -> a + c, c-> a + b

*/
public class Problem2Optimized {

  public static void main(String[] args) {
    int limit = 4000000;
    int sum = 0, a = 1, b = 1;
    int c = a + b;

    while (c < limit) {
      sum += c;
      a = b + c;
      b = a + c;
      c = a + b;
    }

    System.out.println(sum);

  }
}
