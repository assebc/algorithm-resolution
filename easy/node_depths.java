import java.util.*;

class Program {

  public static int nodeDepths(BinaryTree root) {
      int depths = 0;
      return nodeDepthsAux(root, depths);
  }

  public static int nodeDepthsAux(BinaryTree root, Integer depths){
    if (root == null) return 0;
    return depths + nodeDepthsAux(root.left, depths+1) + nodeDepthsAux(root.right, depths + 1);
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}

