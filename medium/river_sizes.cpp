#include <vector>
using namespace std;

// Depth First Algorithm version for matrix instead of graphs
void dfs(vector<vector<int>> &matrix, int x, int y, int &size){
  int n = matrix.size();
  int m = matrix[0].size();
  if( (x<n && x>=0) && (y<m && y>=0) ){
    if(matrix[x][y]==1){
      matrix[x][y] = -1;
      size++;
      dfs(matrix,x,y-1,size);
      dfs(matrix,x,y+1,size);
      dfs(matrix,x-1,y,size);
      dfs(matrix,x+1,y,size);
    }
  }
}

// Time Complexity: O(N*V) Space Complexity: O(N*V)
vector<int> riverSizes(vector<vector<int>> matrix) {
  vector<int> res;
  int n = matrix.size();
  int m = matrix[0].size();

  for(int i=0;i<n;i++){
    for(int j =0;j<m;j++){
      if(matrix[i][j]==1){
        int size = 0;
        dfs(matrix,i,j,size);
        res.push_back(size);
      }
    }
    
  }
  
  return res;
}