import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    Map<Character, Integer> repeat = new HashMap<>();
    char[] chars = string.toCharArray();
    for(char c : chars){
      repeat.merge(c, 1, Integer::sum);
    }
    for(int i = 0;i<chars.length;i++){
      if(repeat.get(chars[i])==1) return i;
    }
    return -1;
  }
}

