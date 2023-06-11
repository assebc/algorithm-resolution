import java.util.*;

class Program {
  public static boolean hasSingleCycle(int[] array) {
    int atm = 0, tmp = array[0];
    for(int i = 0;i<array.length;i++){
      atm += tmp;
      atm %= array.length;
      if(atm < 0) atm += array.length;
      if(array[atm] == 0) return false;
      tmp = array[atm];
      array[atm] = 0;
    }
    return true;
  }
}

