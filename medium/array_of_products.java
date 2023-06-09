import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
    int[]res = new int[array.length];
    for(int i = 0;i<array.length;i++){
      int atm = 1;
      for(int j = 0;j<array.length;j++){
        if(j==i)atm*=1;
        else atm *= array[j];
      }
      res[i] = atm;
    }
    return res;
  }
}

