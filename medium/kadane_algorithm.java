import java.util.*;

class Program {
  public static int kadanesAlgorithm(int[] array) {
    int max = Integer.MIN_VALUE, atm = 0;
    for(int x : array){
      max = Math.max(max,atm+x);
      atm = Math.max(0,atm+x);
    }
    return max;
  }
}

