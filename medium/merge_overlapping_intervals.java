import java.util.*;

class Program {

  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    if(intervals.length<=1)return intervals;
    Arrays.sort(intervals,(i1,i2) -> Integer.compare(i1[0],i2[0]));
    int [] prevInterval = intervals[0];
    List<int[]> mergedIntervals = new ArrayList<>();
    for(int i = 1; i<intervals.length;i++){
      int[] currentInterval = intervals[i];
      if(prevInterval[1]>=currentInterval[0]) prevInterval[1] = Math.max(currentInterval[1],prevInterval[1]);
      else {
        mergedIntervals.add(prevInterval);
        prevInterval = currentInterval;
      }
      if(i == intervals.length-1) mergedIntervals.add(prevInterval);
    }
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
  }
}

