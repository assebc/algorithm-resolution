import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> sums = new ArrayList<Integer>();
    branchSumsAux(root,0,sums);
    return sums;
  }

  public static void branchSumsAux(BinaryTree root, Integer atmSum, List<Integer> list){
    if (root == null) return;
    int newAtmSum = atmSum + root.value;
    if(root.left == null && root.right == null){
      list.add(newAtmSum);
      return;
    }
    branchSumsAux(root.left, newAtmSum, list);
    branchSumsAux(root.right, newAtmSum, list);
  }
}

