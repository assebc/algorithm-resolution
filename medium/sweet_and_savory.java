import java.util.*;

class Program {

  public int[] sweetAndSavory(int[] dishes, int target) {
    int [] res = new int[2];
    Arrays.sort(dishes);
    if(dishes.length == 0 || dishes[0] >= 0 ) return res;
    int l = 0;
    int r = dishes.length-1;
    int diff = Integer.MAX_VALUE;

    while(l<r){
      if(!(dishes[l] < 0 && dishes[r] > 0)) break;
      int atm_sum = dishes[l] + dishes[r];
      int atm_diff = Math.abs(target-atm_sum);

      if(atm_diff < diff && atm_sum <= target){
        res[0] = dishes[l];
        res[1] = dishes[r];
        diff = atm_diff;
        if(diff == 0) return res;
      }
      if(atm_sum < target) l++;
      else if(atm_sum >= target) r--;
    }
    
    return res;
  }
}

