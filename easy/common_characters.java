import java.util.*;

class Program {
  public static String[] commonCharacters(String[] strings) {
        Set<Character> commonChars = new HashSet<>();
        if (strings.length > 0) {
            String firstString = strings[0];
            for (char c : firstString.toCharArray()) {
                boolean isCommon = true;
                for (int i = 1; i < strings.length; i++) {
                    if (strings[i].indexOf(c) == -1) {
                        isCommon = false;
                        break;
                    }
                }
                if (isCommon) commonChars.add(c); 
            }
        }
        String[] result = new String[commonChars.size()];
        List<Character> common = new ArrayList<>(commonChars);
        for (int i = 0; i < common.size(); i++) {
            result[i] = String.valueOf(common.get(i));
        }
        return result;
    }
}

