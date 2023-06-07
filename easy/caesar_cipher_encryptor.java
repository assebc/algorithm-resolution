import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String res = "";
    for(int i = 0; i<str.length();i++){
      int pos = alphabet.indexOf(str.charAt(i));
      int tmp_pos = (pos + key)%26;
      res += alphabet.charAt(tmp_pos);
    }
    return res;
  }
}

