import java.util.*;

class Program {
  // Do not edit the class below except for the
  // populateSuffixTrieFrom and contains methods.
  // Feel free to add new properties and methods
  // to the class.
  static class TrieNode {
    Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
  }

  static class SuffixTrie {
    TrieNode root = new TrieNode();
    char endSymbol = '*';

    public SuffixTrie(String str) {
      populateSuffixTrieFrom(str);
    }

    public void populateSuffixTrieFrom(String str) {
      for(int i = 0;i<str.length();i++){
        String word = str.substring(i);
        TrieNode current = root;
        for(Character c : word.toCharArray()){
          if(!current.children.containsKey(c)){
            TrieNode t = new TrieNode();
            current.children.put(c,t);
          }
          current = current.children.get(c);
        }
        current.children.put(endSymbol,null);
      }
    }

    public boolean contains(String str) {
      TrieNode current = root;
      for(Character c : str.toCharArray()){
        if(!current.children.containsKey(c)) return false;
        current = current.children.get(c);
      }
      if(current.children.containsKey(endSymbol)) return true;
      return false;
    }
  }
}

