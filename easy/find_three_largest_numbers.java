import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    int [] big = { Integer.MIN_VALUE, Integer.MIN_VALUE,Integer.MIN_VALUE};
    
    for(int x : array){
      if(x>big[0]){
        big[0] = x;
        Arrays.sort(big);
      }
    }
    return big;
  }
}

