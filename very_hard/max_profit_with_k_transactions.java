import java.util.*;

class Program {
  public static int maxProfitWithKTransactions(int[] prices, int k) {
    int days = prices.length;
    int [][] transactions = new int[k+1][days+1];

    for(int i = 1; i<k+1;i++){
      for (int j = 1; j<days;j++){
        int max = 0;
        for(int m = 0; m< j;m++){
          max = Math.max(max,prices[j] - prices[m] + transactions[i-1][m]);
        }
        transactions[i][j] = Math.max(transactions[i][j-1], max);
      }
    }
    int result = 0;
    for(int i = 0;i<k+1;i++){
      for(int j = 0; j<days;j++){
        if(transactions[i][j]>result) result = transactions[i][j];
      }
    }
    
    return result;
  }
}

