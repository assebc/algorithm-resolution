import java.util.*;

class Program {
  public static int[] mergeSort(int[] array) {
    return mergeSortAux(array, 0 , array.length-1);
  }

  public static int[] mergeSortAux(int[]array, int start, int end){
    if(start == end) return new int[]{array[start]};
    int mid = (end + start) / 2;
    int [] left = mergeSortAux(array,start, mid);
    int [] right = mergeSortAux(array,mid+1,end);
    
    int [] res = new int[left.length+right.length];
    int l = 0, r = 0, i = 0;

    while(l<left.length && r < right.length){
      if(left[l]<=right[r]) res[i++] = left[l++];
      else res[i++] = right[r++];
    }
    while(l<left.length) res[i++] = left[l++];
    while(r<right.length) res[i++] = right[r++];
    
    return res;
  }
}

