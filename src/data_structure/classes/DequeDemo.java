package data_structure.classes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Deque (double ended queue) interface is part of java.util and it's a linear collection that
 * supports insertion and removal of element at both ends. There are 2 forms of methods exists in
 * Deque, one which throws exception when operation fails and other which returns special value
 * (either null or false) depending on operation. peek method works equally well when a deque is
 * used as queue or a stack. In both case elements are drawn from the beginning of the deque.
 */
public class DequeDemo {

  public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>();
    // We can add elements to the deque in various ways

    // Add at last
    deque.add("Element 1 (Tail)");

    // Add at first
    deque.addFirst("Element 2 (Head)");

    // Add at last
    deque.addLast("Element 3 (Tail)");

    // Add at first
    deque.push("Element 4 (Head)");

    // Add at last
    deque.offer("Element 5 (Tail)");  // Same as offerLast()

    // Add at first
    deque.offerFirst("Element 6 (Head)");

    System.out.println("Deque before removing any element: " + deque);

    // Remove from deque using removeFirst() and removeLast()
    deque.removeFirst();

    System.out.println("Deque after removing first: " + deque);

    // using ArrayDeque class and methods
    Deque<String> dq = new ArrayDeque<>();
    dq.add("For");
    dq.addFirst("Geeks");
    dq.addLast("Geeks");

    System.out.println("dq: " + dq);

    // remove using pop(), poll(), pollFirst(), pollLast()

    System.out.println(dq.pop());
    System.out.println(dq.poll());
    System.out.println(dq.pollFirst());
    System.out.println(dq.pollLast());

    // Iterating through deque from both ends
    dq.add("For");
    dq.addFirst("Geeks");
    dq.addLast("Geeks");
    dq.add("is so good");

    for (Iterator itr = dq.iterator(); itr.hasNext(); ) {
      System.out.print(itr.next() + " ");
    }

    System.out.println();

    for (Iterator itr = dq.descendingIterator(); itr.hasNext(); ) {
      System.out.print(itr.next() + " ");
    }

  }
}
