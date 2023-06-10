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

  public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
    BST tree = new BST(preOrderTraversalValues.get(0));
    for(int i = 1; i< preOrderTraversalValues.size();i++) insert(tree, preOrderTraversalValues.get(i));
    return tree;
  }

  public void insert(BST tree, int value){
    if(value>=tree.value){
      if(tree.right==null) tree.right = new BST(value);
      else insert(tree.right,value);
    } else{
      if(tree.left == null) tree.left = new BST(value);
      else insert(tree.left,value);
    }
  }
}

