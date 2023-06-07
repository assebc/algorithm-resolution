import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {
    for(int i = 0;i<array.length-1;i++){
      int tmp = i;
      for(int j = i+1;j<array.length;j++){
        if(array[tmp]>array[j]) tmp = j;
      }
      if(array[i]>array[tmp]){
        int aux = array[tmp];
        array[tmp] = array[i];
        array[i] = aux;
      }
    }
    return array;
  }
}

