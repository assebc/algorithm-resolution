import java.util.*;

class Program {
  public static int numbersInPi(String pi, String[] numbers) {
    int [] res = new int[pi.length()+1];
    Arrays.fill(res, Integer.MAX_VALUE);
    res[0] = 0;

    for(int i = 0;i<res.length;i++){
      if(res[i]==Integer.MAX_VALUE) continue;
      String sub = pi.substring(i);
  
      for(String str: numbers){
        if(!sub.startsWith(str)) continue;

        int index = i + str.length();
        res[index] = Math.min(res[index], res[i]+1);
      }
    }
    
    return res[pi.length()] == Integer.MAX_VALUE ? -1 : res[pi.length()] -1;
  }
}

