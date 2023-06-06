import java.util.*;

class Program {
  public static int findClosestValueInBst(BST tree, int target) {
     return findClosestValueInBstAux(tree,target, Float.POSITIVE_INFINITY);
  }

  public static int findClosestValueInBstAux(BST tree, int target, float closest){
    if (tree == null) return (int)closest;
    if (Math.abs(target - closest) > Math.abs(target - tree.value))closest = tree.value;  
    if (target < tree.value) return findClosestValueInBstAux(tree.left,target,closest);
    else if (target > tree.value) return findClosestValueInBstAux(tree.right,target,closest);
    else return (int)closest;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}

