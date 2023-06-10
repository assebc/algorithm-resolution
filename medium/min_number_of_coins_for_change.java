import java.util.*;

class Program {
  public static int minNumberOfCoinsForChange(int n, int[] denoms) {
    int[] vals = new int[n+1];
    Arrays.fill(vals,Integer.MAX_VALUE);
    vals[0] = 0;
    for(int denom : denoms){
      for(int i = 1; i<= n;i++){
        if(i>=denom){
          if(vals[i-denom]<Integer.MAX_VALUE) vals[i] = Math.min(vals[i], vals[i-denom]+1);
        }
      }
    }
    return vals[n] == Integer.MAX_VALUE ? -1 : vals[n];
  }
}

