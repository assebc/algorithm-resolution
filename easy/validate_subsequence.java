import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int i = 0;
    for(int x:array){
      if(x == sequence.get(i)) i++;
      if(i==sequence.size()) return true;
    }
    return i == sequence.size();
  }
}

