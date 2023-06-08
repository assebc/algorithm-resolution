import java.util.*;

class Program {
  public boolean generateDocument(String characters, String document) {
    Map<Character,Integer> amount_c = new HashMap<>();
    Map<Character,Integer> amount_d = new HashMap<>();
    char[] chars = characters.toCharArray();
    char[] docs = document.toCharArray();
    for(char x : chars)
      amount_c.merge(x, 1, Integer::sum);
    for(char x : docs)
      amount_d.merge(x, 1, Integer::sum);
    for(char k : amount_d.keySet()){
      if(!amount_c.containsKey(k) || amount_d.get(k)>amount_c.get(k)) return false;
    }
    return true;
  }
}

