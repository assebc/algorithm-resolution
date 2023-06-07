import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    return productSumAux(array,1);
  }

  public static int productSumAux(List<Object> array, int mult){
    int sum = 0;
    for(Object x : array){
      if(x instanceof ArrayList) sum += productSumAux((ArrayList)x, mult+1);
      else sum += (int)x;
    }
    return sum * mult;
    
  }
  
}

