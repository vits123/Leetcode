package com.problems.myleetcode.Top100;

/**
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note
 * here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes)
 * time complexity.
 */


public class OddEvenLinkedList {

  // Linked List Node
  static class Node {

    int data;
    Node next;
  }

  // A utility function to create a new node
  static Node newNode(int key) {
    Node temp = new Node();
    temp.data = key;
    temp.next = null;
    return temp;
  }

  // Rearranges given linked list
// such that all even positioned
// nodes are before odd positioned.
// Returns new head of linked List.
  static Node rearrangeEvenOdd(Node head) {
    // Corner case
    if (head == null) {
      return null;
    }

    // Initialize first nodes of even and
    // odd lists
    Node odd = head;
    Node even = head.next;

    // Remember the first node of even list so
    // that we can connect the even list at the
    // end of odd list.
    Node evenFirst = even;

    while (even != null && even.next != null) {
      odd.next = odd.next.next;
      even.next = even.next.next;
      odd = odd.next;
      even = even.next;
    }
    odd.next = evenFirst;
    return head;
  }

  // A utility function to print a linked list
  static void printlist(Node node) {
    while (node != null) {
      System.out.print(node.data + "->");
      node = node.next;
    }
    System.out.println("NULL");
  }

  // Driver code
  public static void main(String[] args) {
    Node head = newNode(1);
    head.next = newNode(2);
    head.next.next = newNode(3);
    head.next.next.next = newNode(4);
    head.next.next.next.next = newNode(5);

    System.out.println("Given Linked List");
    printlist(head);

    head = rearrangeEvenOdd(head);

    System.out.println("Modified Linked List");
    printlist(head);
  }
}




