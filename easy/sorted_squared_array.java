import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    int [] res = new int[array.length];
    for(int i = 0; i<array.length;i++) res[i] = array[i]*array[i];
    Arrays.sort(res);
    return res;
  }
}

