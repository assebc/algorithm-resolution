import java.util.*;

class Program {
  public int majorityElement(int[] array) {
    Map<Integer,Integer> acc = new HashMap<>();
    for(int x:array){
      acc.merge(x,1,Integer::sum);
    }
    return Collections.max(acc.entrySet(), Map.Entry.comparingByValue()).getKey();
  }
}

