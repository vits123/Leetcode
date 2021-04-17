package data_structure.classes;

import java.util.BitSet;

/**
 * This class implements a vector of bits that grows as needed. Each component of the bit set has a
 * boolean value. The bits of BitSet are indexed by non-negative integers. Individual indexed bits
 * can be set, clear or examined. One BitSet may be used to modify the contents of another BitSet
 * through && , || or exclusive or. Initially all bits in a BitSet have the value of false. A bitset
 * is not safe for multithreaded use without external synchronization.
 */

public class BitSetDemo {

  public static void main(String[] args) {
    BitSet bs1 = new BitSet();
    BitSet bs2 = new BitSet(6);

    bs1.set(0);
    bs1.set(1);
    bs1.set(2);
    bs1.set(4);

    bs2.set(4);
    bs2.set(6);
    bs2.set(5);
    bs2.set(1);
    bs2.set(2);
    bs2.set(3);

    System.out.println("bs1: " + bs1);
    System.out.println("bs2: " + bs2);


  }
}
