import java.util.*;

class Program {
  public static int[] quickSort(int[] array) {
    return rec(array, 0 , array.length-1); 
  }

  public static void swap(int [] array, int i, int j){
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  public static int[] rec(int []array, int l, int r){
    if(l>=r) return array;
    int mid = array[r];
    int lowBound = l;
    int highBound = r;
    while(lowBound<highBound){
      while(array[lowBound]<=mid && lowBound<highBound) lowBound++;
      while(array[highBound]>=mid && lowBound<highBound) highBound--;
      swap(array,lowBound,highBound);
    }
    swap(array,r,lowBound);
    rec(array,l,lowBound-1);
    rec(array,lowBound+1,r);
    return array;  
    
  }
}

