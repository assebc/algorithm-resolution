import java.util.*;

class Program {
  public static void invertBinaryTree(BinaryTree tree) {
    if(tree==null) return;
    BinaryTree tmp = tree.left;
    tree.left = tree.right;
    tree.right = tmp;
    
    invertBinaryTree(tree.left);
    invertBinaryTree(tree.right);
  }

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
}

