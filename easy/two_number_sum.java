import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    
    for(int i=0;i<array.length-1;i++){
      int lookingFor = targetSum - array[i];
        for(int j = i+1;j<array.length;j++){
          if (array[j] == lookingFor){
            int [] res = new int[2];
            res[0] = array[i];
            res[1] = lookingFor;
            return res;
          }
        }
    }
    return new int[0];
  }
}

