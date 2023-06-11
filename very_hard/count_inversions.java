import java.util.*;

class Program {

  public int countInversions(int[] array) {
    int res = 0;
    for(int i = 0;i<array.length-1;i++){
      for(int j = i+1;j<array.length;j++){
        if(array[i]>array[j]) res++;
      }
    }
    return res;
  }
}

