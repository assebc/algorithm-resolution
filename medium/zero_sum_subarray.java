import java.util.*;

class Program {
  public boolean zeroSumSubarray(int[] nums) {
    Set<Integer> sums = new HashSet<>();
    int atm = 0;
    for(int x : nums){
      atm += x;
      if(x == 0 || atm == 0 || !sums.add(atm)) return true;
    }
    return false;
  }
}

