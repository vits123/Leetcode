package DSHelpers.stack;

/*
    1. Stack is also referred as LIFO or FILO stack of objects.
    2. It supports push, pop, peek, empty, search operations.
    3. Stack is used in forward and backward features of web browsers, redo-undo features editor or photoshop.
    4. It also used in many useful algorithms like tower of hanoi, tree traversals, stock span problem, histogram problem.
    5. In backtracking stack is useful for storing previous state.
    6. In memory management computer uses stack.
    7. In topological sorting also stack is useful.
 */

class Stack {

  static final int MAX = 1000;
  int top;
  int[] a = new int[MAX];

  public Stack() {
    top = -1;
  }

  public boolean isEmpty() {
    return top < 0;
  }

  public boolean push(int x) {
    if (top >= MAX - 1) {
      System.out.println("Stack overflow - stack is already full");
      return false;
    } else {
      a[++top] = x;
      System.out.println(x + " pushed into stack");
      return true;
    }
  }

  public int pop() {
    if (top < 0) {
      System.out.println("Stack underflow - stack is empty");
      return 0;
    } else {
      int e = a[top--];
      return e;
    }
  }

  public int peek() {
    if (top < 0) {
      System.out.println("Stack underflow - stack is empty");
      return 0;
    } else {
      int e = a[top];
      return e;
    }
  }

}

public class StackUsingArray {

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    System.out.println(s.pop() + " popped from stack");
    System.out.println(s.peek() + " is at top of stack");
  }
}
