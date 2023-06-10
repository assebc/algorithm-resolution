import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;
    public BinaryTree parent = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
    if(tree.left == null && tree.right == null) return null;
    ArrayList<Integer> array = search(tree,  new ArrayList<>());
    for(int i = 0;i<array.size()-1;i++) if(array.get(i)==node.value) return new BinaryTree(array.get(i+1));
    return null;
  }

  public ArrayList<Integer> search(BinaryTree tree, ArrayList<Integer> array){
    if(tree.left !=null) search(tree.left,array);
    array.add(tree.value);
    if(tree.right!=null) search(tree.right,array);
    return array;
  }
  
}

