import java.util.*;

class Program {
  public static int levenshteinDistance(String str1, String str2) {
    if(str1.equals(str2)) return 0;
    int changes = Math.abs(str1.length() - str2.length());
    int [][] difs = new int[str1.length()+1][str2.length()+1];
    for(int i = 0;i<str2.length()+1;i++) difs[0][i] = i;
    for(int i = 0;i<str1.length()+1;i++) difs[i][0] = i;
    for(int i = 1; i< str1.length() +1 ;i++){
      for(int j = 1;j<str2.length()+1;j++){
        if(str2.charAt(j-1) == str1.charAt(i-1)) difs[i][j] = difs[i-1][j-1];
        else difs[i][j] = 1 + Math.min(difs[i-1][j-1], Math.min(difs[i][j-1],difs[i-1][j]));
      }
    }
    return difs[str1.length()][str2.length()];
  }
}

