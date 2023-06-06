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

  public int evaluateExpressionTree(BinaryTree tree) {
    // -1 + | -2 l - r | -3 l / r | -4 *
    if (tree.value>=0) return tree.value;
    int leftValue = evaluateExpressionTree(tree.left);
    int rightValue = evaluateExpressionTree(tree.right);

    if(tree.value == -1) return leftValue + rightValue;
    if(tree.value == -2) return leftValue - rightValue;
    if(tree.value == -3) return (int)(leftValue / rightValue);
    return leftValue * rightValue;
  }
}

