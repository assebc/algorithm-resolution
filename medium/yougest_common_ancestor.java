import java.util.*;

class Program {
  public static AncestralTree getYoungestCommonAncestor(
      AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
    Set<AncestralTree> set = new HashSet<>();
    AncestralTree aux = descendantOne;

    while(aux!=null){
      set.add(aux);
      aux = aux.ancestor;
    }
    aux = descendantTwo;
    while(aux!=null){
      if(set.contains(aux)) return aux;
      aux = aux.ancestor;
    }
  
    return null;
  }

  static class AncestralTree {
    public char name;
    public AncestralTree ancestor;

    AncestralTree(char name) {
      this.name = name;
      this.ancestor = null;
    }

    // This method is for testing only.
    void addAsAncestor(AncestralTree[] descendants) {
      for (AncestralTree descendant : descendants) {
        descendant.ancestor = this;
      }
    }
  }
}

