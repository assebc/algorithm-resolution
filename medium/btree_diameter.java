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
  int diameter = 0;
  public int binaryTreeDiameter(BinaryTree tree) {
    diameterAux(tree);
    return diameter;
  }
  public int diameterAux(BinaryTree tree){
    int left = 0, right = 0;
    if(tree.left == null && tree.right == null) return 0;
    
    if(tree.left != null) left = diameterAux(tree.left)+1;
    if(tree.right != null) right = diameterAux(tree.right)+1;
    if(left + right > diameter) diameter = left + right;
       
    return Math.max(left,right);
  }
  
}

