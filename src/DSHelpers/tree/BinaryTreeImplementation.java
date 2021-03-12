package DSHelpers.tree;

/*
   A tree whose elements have at most 2 children is called Binary tree. If tree is empty then value of root is NULL.
   Nodes in the tree can be search using tree traversals. (Preorder, Inorder, Postorder)

   1. The maximum no. of nodes at level 'l' of binary tree is 2^l.
   2. The maximum no. of nodes in binary tree of height 'h' is 2^h - 1.
   3. In a binary tree with N nodes, minimum possible height or minimum number of levels is Log2(N + 1).
   4. A binary tree with L leaves has at least |Log2 L| + 1 levels.
   5. In a binary tree where every node has either 0 or 2 children, no. of leaf nodes is always 1 more than nodes with 2 children.

   Types of Binary tree:
   Full binary tree - Binary tree in which all nodes has 2 children except leaf nodes.
   Complete binary tree - In this tree all the levels are completely filled except possibly the last level and nodes at last level are at left side of tree. (e.g. Binary Heap)
   Perfect binary tree - In this tree all internal nodes has 2 children and all leaf nodes are at the same level.
   Balanced binary tree - A tree which has height = Log n where n is no. of nodes. (AVL tree, Red black tree)
   Pathological binary tree - In this tree each internal node has exactly 1 children. (same performance as Linked List).

 */

import java.util.Scanner;

class BTNode {

  int val;
  BTNode left = null, right = null;

  public BTNode(int val) {
    this.val = val;
  }

  public void setLeft(BTNode n) {
    left = n;
  }

  public void setRight(BTNode n) {
    right = n;
  }

  public BTNode getLeft() {
    return left;
  }

  public BTNode getRight() {
    return right;
  }

  public void setVal(int val) {
    val = val;
  }

  public int getVal() {
    return val;
  }

}

class BT {

  // root of tree
  private BTNode root;

  // constructor
  public BT() {
    root = null;
  }

  // to check if tree is empty
  public boolean isEmpty() {
    return root == null;
  }

  // to insert data
  public void insert(int val) {
    root = insert(root, val);
  }

  // insert data recursively
  private BTNode insert(BTNode node, int val) {
    if (node == null) {
      node = new BTNode(val);
    } else {
      if (node.getLeft() == null) {
        node.left = insert(node.left, val);
      } else {
        node.right = insert(node.right, val);
      }
    }
    return node;
  }

  public int countNodes() {
    return countNodes(root);
  }

  private int countNodes(BTNode r) {
    if (r == null) {
      return 0;
    } else {
      int l = 1;
      l += countNodes(r.getLeft());
      l += countNodes(r.getRight());
      return l;
    }

  }

  // search an element in binary tree
  public boolean search(int val) {
    return search(root, val);
  }

  private boolean search(BTNode r, int val) {
    if (r.getVal() == val) {
      return true;
    }

    if (r.getLeft() != null) {
      if (search(r.getLeft(), val)) {
        return true;
      }
    }

    if (r.getRight() != null) {
      if (search(r.getRight(), val)) {
        return true;
      }
    }

    return false;
  }

  // inorder traversal
  public void inorder() {
    inorder(root);
  }

  private void inorder(BTNode r) {
    if (r != null) {
      inorder(r.getLeft());
      System.out.print(r.getVal() + " ");
      inorder(r.getRight());
    }
  }

  // preorder traversal
  public void preorder() {
    preorder(root);
  }

  private void preorder(BTNode r) {
    if (r != null) {
      System.out.print(r.getVal() + " ");
      preorder(r.getLeft());
      preorder(r.getRight());
    }
  }

  // postorder traversal
  public void postorder() {
    postorder(root);
  }

  private void postorder(BTNode r) {
    if (r != null) {
      postorder(r.getLeft());
      postorder(r.getRight());
      System.out.print(r.getVal() + " ");
    }
  }
}

public class BinaryTreeImplementation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BT bt = new BT();

    System.out.println("Binary tree implementation\n");
    char ch;

    do {
      System.out.println("\nFollowing operations are supported:");
      System.out.println("1. Insert");
      System.out.println("2. Search");
      System.out.println("3. Count nodes");
      System.out.println("4. Check empty");

      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter integer element to insert");
          bt.insert(scanner.nextInt());
          break;

        case 2:
          System.out.println("Enter element to search");
          System.out.println("Search result: " + bt.search(scanner.nextInt()));
          break;

        case 3:
          System.out.println("Nodes count = " + bt.countNodes());
          break;

        case 4:
          System.out.println("Empty status = " + bt.isEmpty());
          break;

        default:
          System.out.println("Wrong entry");
          break;
      }

      // Display tree
      System.out.print("\nPreorder: ");
      bt.preorder();

      System.out.print("\nInorder: ");
      bt.inorder();

      System.out.print("\nPostorder: ");
      bt.postorder();

      System.out.println("\nDo you want to continue (Type Y or y)");
      ch = scanner.next().charAt(0);
    } while (ch == 'Y' || ch == 'y');
  }
}