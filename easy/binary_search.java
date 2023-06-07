import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    return binarySearchAux(array,target,0,array.length-1);
  }

  public static int binarySearchAux(int[] array, int target, int left, int right){
    if (left > right) return -1;
    int mid = (left + right) / 2;
    if (target == array[mid]) return mid;
    else if(target<array[mid]) return binarySearchAux(array,target,left,mid-1);
    else return binarySearchAux(array,target,mid+1,right);
  }
}
