import java.util.*;

class Program {

  public int[][] removeIslands(int[][] matrix) {
    for(int i = 0;i<matrix.length;i++){
      dfs(matrix,i,0);
      dfs(matrix,i,matrix[0].length-1);
    }
    for(int i = 0;i<matrix[0].length;i++){
      dfs(matrix,0,i);
      dfs(matrix,matrix.length-1,i);
    }

    for(int i = 0;i<matrix.length;i++){
      for(int j = 0; j<matrix[0].length;j++){
        matrix[i][j] = matrix[i][j] == 2 ? 1 : 0;
      }
    }
    return matrix;
  }

  public void dfs(int [][]matrix, int row, int col){
    boolean validRow = row >= 0 && row < matrix.length;
    boolean validCol = col >= 0 && col < matrix[0].length;

    if(!validRow || !validCol || matrix[row][col]!=1) return;

    matrix[row][col] = 2;
    dfs(matrix,row-1,col);
    dfs(matrix,row+1,col);
    dfs(matrix,row,col-1);
    dfs(matrix,row,col+1);
  }
}

