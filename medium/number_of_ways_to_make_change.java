import java.util.*;

class Program {
  public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    if(denoms.length == 0) return 0;
    int[] res = new int[n+1];
    res[0] = 1;
    for(int denom : denoms){
      for(int amount = 1;amount < res.length;amount++){
        if(denom <= amount) res[amount] += res[amount - denom];
      }
    }
    return res[res.length-1];
  }
}

