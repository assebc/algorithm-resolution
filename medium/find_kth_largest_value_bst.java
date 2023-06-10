import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

  public int findKthLargestValueInBst(BST tree, int k) {
    LinkedList<BST> stack = new LinkedList<>();
    while(true){
      while(tree!=null){
        stack.push(tree);
        tree = tree.right;
      }
      tree = stack.pop();
      if(--k==0) return tree.value;
      tree = tree.left;
    }
  }

  
}

