/*
     Linked list implementation in java
 */


package data_structure.linkedlist;

import java.util.LinkedList;

public class LinkedListImpl extends LinkedList {

  // LL node structure
  public class Node {

    int val;
    public Node next;

    public Node(int val) {
      this.val = val;
    }
  }

  Node head = null, tail = null;


  public static void main(String[] args) {
    LinkedListImpl listImpl = new LinkedListImpl();
    listImpl.addNode(10);
    listImpl.addNode(20);
    listImpl.addNode(30);
    listImpl.addNode(40);
    listImpl.addNode(100);
    listImpl.addNodeAtStart(50);
    listImpl.addNodeAtIndex(70, 2);
    listImpl.printLinkedList();
    //listImpl.removeNode();
    //listImpl.removeNodeAtIndex(3);
    //listImpl.removeNodeAtStart();
    Boolean isFound = listImpl.search(100);
    System.out.println();
    System.out.println("Found or Not found target element: " + isFound);
  }

  protected Boolean search(int target) {
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    if (temp.val == target) {
      return true;
    }
    return false;
  }

  protected void removeNodeAtStart() {
    head = head.next;
  }

  protected void addNodeAtIndex(int val, int index) {
    Node temp = head;
    int count = 0;
    while (temp != null && ++count != index) {
      temp = temp.next;
    }

    Node node = new Node(val);
    node.next = temp.next;
    temp.next = node;
  }

  // Adds a node at start of LL
  protected Node addNodeAtStart(int val) {
    if (head == null) {
      Node temp = new Node(val);
      head = temp;
      tail = temp;
    } else {
      // LL is not empty and already has head element
      Node temp = new Node(val);
      temp.next = head;
      head = temp; // new head
    }
    return head;
  }

  protected void removeNodeAtIndex(int index) {
    Node temp = head;
    int count = 0;
    while (temp != null && ++count != index) {
      temp = temp.next;
    }
    temp.val = temp.next.val;
    temp.next = temp.next.next;
  }

  // Remove last node and update tail
  protected void removeNode() {
    Node temp = head;
    while (temp.next != null && temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    tail = temp;
  }

  protected void printLinkedList() {
    System.out.println();
    System.out.println("Printing Linked list..");
    Node temp = head;
    while (temp != null) {
      System.out.print(" " + temp.val);
      temp = temp.next;
    }
  }


  //  Adds node at the end of current list
  protected void addNode(int val) {
    if (head == null) {
      Node temp = new Node(val);
      head = temp;
      tail = temp;
    } else {
      tail.next = new Node(val);
      tail = tail.next;
    }
  }


}
