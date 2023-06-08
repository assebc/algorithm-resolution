import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    int pointerEnd = array.size()-1;
    int pointerStart = 0;
    while(pointerStart<pointerEnd){
      while(array.get(pointerEnd)==toMove && pointerStart<pointerEnd) pointerEnd--;
      if(array.get(pointerStart)==toMove) Collections.swap(array,pointerStart,pointerEnd); 
      pointerStart++;
    }
    return array;
  }
}
