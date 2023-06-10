import java.util.*;

class Program {
  public static int maxSubsetSumNoAdjacent(int[] array) {
    if(array.length==0)return 0;
    if(array.length==1) return array[0];
    int max = array[0], max_prev = 0, tmp = max;
    for(int i = 1;i<array.length;i++){
      max = array[i]+max_prev;
      max_prev = Math.max(tmp,max_prev);
      tmp = max;
    }
    return Math.max(max,max_prev);
  }
}

