import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    Arrays.sort(coins);
    int atm = 0;
    for(int x : coins){
      if(x>atm+1) return atm+1;
      else atm += x;
    }
    return atm+1;
  }
}

