import java.util.*;

class Program {

  public int numberOfWaysToTraverseGraph(int width, int height) {
    int [][] dp = new int[width][height];
    for(int i = 0; i< width;i++){
      for(int j = 0;j<height;j++){
        if(i==0||j==0) dp[i][j] = 1;
        else dp[i][j] = dp[i-1][j] + dp[i][j-1];
      }
    }
      return dp[width-1][height-1];
  }
}

