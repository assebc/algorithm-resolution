import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
    String res = "";
    int len = 1;
    for(int i = 1;i<string.length();i++){
      char currentChar = string.charAt(i); 
      char prevChar = string.charAt(i-1); 

      if (currentChar != prevChar || len == 9){
        res+= String.valueOf(len) + prevChar;
        len = 0;
      }
      len++;
    }

    res += String.valueOf(len) + string.charAt(string.length()-1);
    return res;
  }
}

