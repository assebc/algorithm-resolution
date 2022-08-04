#include <vector>
using namespace std;

int max2(int x,int y){
  if (x>=y) return x;
  else return y;
}
int maxProfitWithKTransactions(vector<int> prices, int k) {
  if(prices.empty()||k==0) return 0;

  vector<vector<int>> profits(2,vector<int>(prices.size(),0));
  while(k--!=0){
    int max = INT_MIN;
    for(int day = 1;day<prices.size();++day){
      max = max2(max,profits[0][day-1]-prices[day-1]);
      profits[1][day] = max2(profits[1][day-1],prices[day]+max);
    }
    swap(profits[0],profits[1]);
  }
  return profits[0][profits[0].size()-1];
}