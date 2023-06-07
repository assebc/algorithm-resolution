import java.util.*;

class Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    Arrays.sort(redShirtSpeeds);
    Arrays.sort(blueShirtSpeeds);
    int speed = 0;
    int len = redShirtSpeeds.length;
    if(fastest){
      for(int i = 0; i< len;i++){
        if(redShirtSpeeds[i]<blueShirtSpeeds[len-1-i]) speed+=blueShirtSpeeds[len-1-i];
        else speed+= redShirtSpeeds[i];
      }
    } else{
      for(int i = 0; i< len;i++){
        if(redShirtSpeeds[i]<blueShirtSpeeds[i]) speed+=blueShirtSpeeds[i];
        else speed+= redShirtSpeeds[i];
      }
    }
    return speed;
  }
}

