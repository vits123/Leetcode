package com.problems.myleetcode.Top100;
/**
 * Time complexity  - O(n**2), Space - O(n)
 * Sieve of Eratosthenes approach
 */

import java.util.Scanner;

public class CountPrimes {

  public static int getPrimeCount(int n) {
    boolean[] primes = new boolean[n];
    for (int i = 2; i * i < primes.length; i++) {
      if (!primes[i]) {
        for (int j = i; j * i < primes.length; j++) {
          primes[i * j] = true;
        }
      }
    }
    int count = 0;
    for (int i = 2; i < primes.length; i++) {
      if (!primes[i]) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner r = new Scanner(System.in);
    System.out.println("Enter value of n");
    int n = r.nextInt();
    System.out.println("No of primes below n are : " + CountPrimes.getPrimeCount(n));
  }
}
