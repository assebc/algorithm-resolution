import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    if(array.length<=1) return true;
    boolean isDecreasing = array[0]>array[array.length-1];
    for(int i = 1;i<array.length;i++){
     if(isDecreasing && array[i]>array[i-1]) return false;
     if(!isDecreasing && array[i]<array[i-1]) return false;
    }
    return true;
  }
}

