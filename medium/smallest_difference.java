import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int[] res = new int[]{arrayOne[0],arrayTwo[0]};
    int diff = Integer.MAX_VALUE;
    int pointerOne = 0, pointerTwo = 0;
    while(pointerOne<arrayOne.length && pointerTwo < arrayTwo.length){
      int tmp_diff = Math.abs(arrayOne[pointerOne] - arrayTwo[pointerTwo]);
      if (tmp_diff < diff){
        diff = tmp_diff;
        res = new int[]{arrayOne[pointerOne],arrayTwo[pointerTwo]};
      }
      if (arrayOne[pointerOne]<arrayTwo[pointerTwo]) pointerOne++;
      else pointerTwo++;
    }  
    return res;
  }
}

