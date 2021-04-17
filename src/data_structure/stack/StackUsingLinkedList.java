package data_structure.stack;

class StackNode {

  int val;
  StackNode next;

  public StackNode(int val) {
    this.val = val;
  }
}

public class StackUsingLinkedList {

  StackNode root;

  public boolean isEmpty() {
    if (root == null) {
      return true;
    }
    return false;
  }

  public void push(int val) {
    StackNode newNode = new StackNode(val);
    if (root == null) {
      root = newNode;
    } else {
      StackNode temp = root;
      root = newNode;
      newNode.next = temp;
    }
    System.out.println(val + " pushed to stack");
  }

  public int pop() {
    int popped = Integer.MIN_VALUE;
    if (root == null) {
      System.out.println("Stack is empty");
    } else {
      popped = root.val;
      root = root.next;
    }
    return popped;
  }

  public int peek() {
    if (root == null) {
      System.out.println("Stack is empty");
      return Integer.MIN_VALUE;
    } else {
      return root.val;
    }
  }

  public static void main(String[] args) {
    StackUsingLinkedList sll = new StackUsingLinkedList();
    sll.push(10);
    sll.push(60);
    sll.push(90);

    System.out.println(sll.pop() + " popped from stack");
    System.out.println("Top element is: " + sll.peek());
  }
}
