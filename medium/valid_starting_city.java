import java.util.*;

class Program {

  public int validStartingCity(int[] distances, int[] fuel, int mpg) {
    for(int i = 0; i< fuel.length;i++){
      fuel[i] = fuel[i] * mpg;
    }

    int start = 0, total = 0;
    for(int i = 0;i<fuel.length;i++){
      total += fuel[i] - distances[i];
      if(total < 0){
        start = (i+1) % fuel.length;
        total = 0;
      }
    }

    return start;
  }
}

