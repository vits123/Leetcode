package data_structure.linkedlist;

public class DoublyLinkedList {

  class DLLNode {

    int data;
    DLLNode prev;
    DLLNode next;

    DLLNode(int d) {
      data = d;
    }
  }

  DLLNode head;

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();

    // insert 6 so linked list becomes 6 -> null
    dll.append(6);

    // insert 7 at the beginning so linked list becomes 7 -> 6 -> null
    dll.push(7);
    dll.push(1);

    dll.append(4);

    dll.insertAfter(dll.head.next, 8);

    System.out.println("Created DLL is: ");

    dll.printlist(dll.head);

  }

  private void printlist(DLLNode node) {
    DLLNode last = null;
    System.out.println("Traversal in forward direction");
    while (node != null) {
      System.out.print(node.data + " ");
      last = node;
      node = node.next;
    }
    System.out.println();
    System.out.println("Traversal in reverse direction");
    while (last != null) {
      System.out.print(last.data + " ");
      last = last.prev;
    }
  }

  private void insertAfter(DLLNode prev_node, int new_data) {
    if (prev_node == null) {
      System.out.println("Given prev node cannot be null");
      return;
    }

    // allocate new node and put in data
    DLLNode new_node = new DLLNode(new_data);

    new_node.next = prev_node.next;
    prev_node.next = new_node;
    new_node.prev = prev_node;

    if (new_node.next != null) {
      new_node.next.prev = new_node;
    }

  }

  // Add node at front of the list
  private void push(int new_data) {
    // allocate node and put in data
    DLLNode new_node = new DLLNode(new_data);

    // Make next of new node to head and previous to NULL
    new_node.next = head;
    new_node.prev = null;

    // change prev of head node to new node
    if (head != null) {
      head.prev = new_node;
    }

    head = new_node;
  }

  // Add a node at the end of the list
  private void append(int new_data) {
    // allocate node and put in data
    DLLNode new_node = new DLLNode(new_data);

    DLLNode last = head;

    // This new node is going to be last node so make next of this node to NULL
    new_node.next = null;

    // If linked list is empty then this node is going to be head node
    if (head == null) {
      new_node.prev = null;
      head = new_node;
      return;
    }

    // else traverse till end
    while (last.next != null) {
      last = last.next;
      last.next = new_node;
      new_node.prev = last;
    }

  }
}
