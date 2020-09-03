/*
      Time complexity - O(n)
      Space complexity - O(n)
      Example - head = [3, 2, 0, -4], pos = 1    pos denotes cycle index
      Approach -  Go through each node one by one and record each node's reference
      in hash table. If current node is null so we reached end of LL so there must not be cycle.
      If current node's reference already present in hashset then cycle exists..
 */

package com.problems.myleetcode.Top100;

import DSHelpers.LinkedListImpl;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkedListCycle extends LinkedListImpl {

  // Write a method to check if LL has a cycle or not
  public boolean hasCycle(Node head, int pos) {
    Set<Node> nodesSeen = new HashSet<>();
    while (head != null) {
      if (nodesSeen.contains(head) && pos != -1) {
        return true;
      } else {
        nodesSeen.add(head);
      }

      head = head.next;
    }

    return false;
  }

  public static void main(String[] args) {
    LinkedListCycle LLC = new LinkedListCycle();
    Node head = LLC.addNodeAtStart(3);
    LLC.addNode(2);
    LLC.addNode(0);
    LLC.addNode(-4);

    System.out.println("Given LL is");
    LLC.printLinkedList();

    Scanner s = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter pos at which cycle exists");
    int input = s.nextInt();

    boolean res = LLC.hasCycle(head, input);
    System.out.println(res);


  }

}
