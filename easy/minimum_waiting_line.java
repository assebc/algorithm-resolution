import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    if(queries.length > 1) {
      Arrays.sort(queries);
      int[] sums = new int[queries.length-1];
      sums[0] = queries[0];
      for(int i = 1; i<queries.length-1;i++){
        sums[i] = sums[i-1] + queries[i];
      }
      return Arrays.stream(sums).sum();
    }
    return 0;
  }
}

