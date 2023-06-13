import java.util.*;

class Program {
  public static List<List<Integer>> getPermutations(List<Integer> array) {
    List<List<Integer>> permutations = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    if(array.size()>0) permutation(array, current, permutations);
    return permutations;
  }
    
  public static void permutation(List<Integer> array, List<Integer> current, List<List<Integer>> permutations){
    if(current.size()==array.size()){
      permutations.add(new ArrayList<>(current));
      return;
    }
    for(int i = 0; i<array.size();i++){
      Integer elem = array.get(i);
      if(!current.contains(elem)){
        current.add(elem);
        permutation(array, current, permutations);
        current.remove(elem);
      }
    }
  }
}

