import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public boolean symmetricalTree(BinaryTree tree) {
    return rec(tree.left, tree.right);
  }

  public boolean rec(BinaryTree tree1, BinaryTree tree2){
    if(tree1 == null && tree2 == null) return true;
    else if(tree1!=null && tree2 == null) return false;
    else if(tree1==null && tree2 != null) return false;
    else if(tree1.value!=tree2.value) return false;
    return rec(tree1.right,tree2.left) && rec(tree1.left,tree2.right);
  }
}

