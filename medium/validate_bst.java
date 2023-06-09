import java.util.*;

class Program {
  public static boolean validateBst(BST tree) {
    return validateBstAux(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  public static boolean validateBstAux(BST tree, int min, int max){
    if(tree == null) return true;
    if(tree.value < min || tree.value >= max) return false;
    boolean left = validateBstAux(tree.left, min, tree.value);
    boolean right = validateBstAux(tree.right, tree.value, max);
    return left && right;
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

