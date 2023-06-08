import java.util.*;

class Program {
  public ArrayList<ArrayList<String>> semordnilap(String[] words) {
    Set<String> wordsSet = new HashSet<String>();
    for(String s: words) wordsSet.add(s);
    ArrayList<ArrayList<String>> res = new ArrayList<>();

    for(String word : words){
      String palindrome = new StringBuilder(word).reverse().toString();
      if (wordsSet.contains(palindrome) && !palindrome.equals(word)){
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add(word);
        tmp.add(palindrome);
        res.add(tmp);
        wordsSet.remove(word);
        wordsSet.remove(palindrome);
      }
    }
    return res;
  }
}

