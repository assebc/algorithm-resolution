import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    Set<Integer> set = new HashSet<>();
    for(int i = 0;i<array.length;i++){
      if(set.contains(array[i])) return array[i];
      set.add(array[i]);
    }
    return -1;
  }
}

