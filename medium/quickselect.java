import java.util.*;

class Program {
  public static int quickselect(int[] array, int k) {
    Arrays.sort(array);
    if(k>array.length) return -1;
    return array[k-1];
  }
}

