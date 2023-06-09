import java.util.*;

class Program {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      BST root = this;
      while(root != null){
        if(root.value> value){
          if(root.left == null) {
            root.left = new BST(value);
            break;
          }
          root = root.left;
        } else{
          if(root.right == null){
            root.right = new BST(value);
            break;
          }
          root = root.right;
        }
      }
      return this;
    }
    
    public boolean contains(int value) {
      BST root = this;
      while(root!=null){
        if(root.value > value) root = root.left;
        else if(root.value < value) root = root.right;
        else return true;
      }
      return false;
    }

    public BST remove(int value) {
      removeAux(this,value);
      return this;
    }

    public BST removeAux(BST tree, int value){
      if(tree == null) return tree;
      if(value < tree.value) tree.left = removeAux(tree.left,value);
      else if(value > tree.value) tree.right = removeAux(tree.right,value);
      else{
        if (tree.left == null && tree.right == null) return null;
        else if(tree.left!=null && tree.right == null){
          tree.value = tree.left.value;
          tree.right = tree.left.right;
          tree.left = tree.left.left;
          return tree;
        } else if(tree.left == null && tree.right != null){
          tree.value = tree.right.value;
          tree.left = tree.right.left;
          tree.right = tree.right.right;
          return tree;
        } else if(tree.left != null && tree.right != null){
          int smallest = small(tree.right);
          tree.value = smallest;
          tree.right = removeAux(tree.right, smallest);
          return tree;
        }
      }
      return tree;
    }

    public int small(BST tree){
      return tree.left == null ? tree.value : small(tree.left);
    }
  }
}

