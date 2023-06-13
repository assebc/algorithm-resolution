import java.util.*;

class Program {
  public String bestDigits(String number, int numDigits) {
    char [] array = number.toCharArray();
    int i = 0;
    for(int j = 0; j < array.length; j++){
      while(numDigits > 0 && i >= 1 && array[j] > array[i-1]){
        i--; numDigits--;
      }
      array[i++] = array[j];
    }
    while(numDigits > 0) {
      i--;
      numDigits--;
    }
    return new String(array, 0 , i);
  }
}


