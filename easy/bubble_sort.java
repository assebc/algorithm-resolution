import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
    for(int i = 0; i<array.length;i++){
      for(int j = i+1;j<array.length;j++){
        if(array[i]>array[j]){
          int tmp = array[i];
          array[i] = array[j];
          array[j] = tmp;
        }
      }
    }
    return array;
  }
}

