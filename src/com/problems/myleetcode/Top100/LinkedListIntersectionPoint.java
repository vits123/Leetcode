package com.problems.myleetcode.Top100;

import DSHelpers.LinkedListImpl;


public class LinkedListIntersectionPoint extends LinkedListImpl {

  public Node getIntersectionNode(Node headA, Node headB) {
    if (headA == null || headB == null) {
      return null;
    }

    Node a_runner = headA;
    Node b_runner = headB;

    while (a_runner != b_runner) {
      if (a_runner == null) {
        a_runner = headB;
      } else {
        a_runner = a_runner.next;
      }

      if (b_runner == null) {
        b_runner = headA;
      } else {
        b_runner = b_runner.next;
      }
    }

    return a_runner;

  }

}
