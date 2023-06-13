import java.util.*;

// Do not edit the class below except for
// the constructor and the createSet, find,
// and union methods. Feel free to add new
// properties and methods to the class.
class Program {
  static class UnionFind {
    Map<Integer, Integer> parent = new HashMap<>();
    Set<Integer> set = new HashSet<>();

    public void createSet(int value) {
      if(!set.contains(value)) {
        parent.put(value,value);
        set.add(value);
      }
    }

    public Integer find(int value) {
      if(set.contains(value)) return parent.get(value);
      return null;
    }

    public void union(int valueOne, int valueTwo) {
      if(!set.contains(valueOne) || !set.contains(valueTwo)) return;
      Integer parent1= find(valueOne);
      Integer parent2 = find(valueTwo);

      if(parent1 != parent2){
        for(Map.Entry<Integer,Integer> entry : parent.entrySet()){
          if(entry.getValue() == parent2) parent.put(entry.getKey(), parent1);
        }
      }
    }
  }
}

