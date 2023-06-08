import java.util.*;

class Program {
  public static List<Integer> riverSizes(int[][] matrix) {
    List<Integer> sizes = new ArrayList<>();
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[i].length;j++){
        if(matrix[i][j] == 0) continue;
        sizes.add(getSize(0,i,j,matrix));
      }
    }
    return sizes;
  }
  public static int getSize(int size, int i, int j, int[][] matrix){
    if(i<0 || j<0 || i==matrix.length || j== matrix[0].length || matrix[i][j]==0) return 0;
    matrix[i][j] = 0;
    int right = getSize(size,i,j+1,matrix);
    int left = getSize(size,i,j-1,matrix);
    int top = getSize(size,i+1,j,matrix);
    int bot = getSize(size,i-1,j,matrix);
    size += right + left + top + bot + 1;
    return size;
  }
}
