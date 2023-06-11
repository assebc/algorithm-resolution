import java.util.*;

class Program {
  public static int[] heapSort(int[] array) {
    int size = array.length;
    for(int i = (size/2)-1;i>=0;i--) heapify(array,i,size);
    for(int i = size-1;i>=0;i--){
      swap(array,i,0);
      heapify(array,0,i);
    }
    return array;
  }

  public static void heapify(int [] array, int max, int size){
    int atm = max;
    int left = 2*max+1;
    int right = 2*max+2;

    if(left<size && array[left]>array[atm]) atm = left;
    if(right<size && array[right]>array[atm]) atm = right;

    if(atm!=max){
      swap(array,atm,max);
      heapify(array,atm,size);
    }
    
  } 
  
  public static void swap(int[]array, int i, int j){
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  
}

