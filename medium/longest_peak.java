import java.util.*;

class Program {
  public static int longestPeak(int[] array) {
    int count = 0, maxPeak = 0;
    boolean peak = false;
    for(int i = 1;i<array.length;i++){
      if(array[i-1] < array[i] && !peak) count = (count==0)? 2 : count+1;
      else if(count>0 && array[i-1]>array[i]){
        count = (count==0)?2:count+1;
        maxPeak = Math.max(maxPeak, count);
        peak = true;
      } else if(array[i-1]<array[i]&& peak){
        count = 2;
        peak = false;
      } else{
        count = 0;
        peak = false;
      }
    }
    return maxPeak;
  }
}

