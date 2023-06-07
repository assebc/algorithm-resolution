import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    String aux = new StringBuilder(str).reverse().toString();
    return aux.equals(str);
  }
}

