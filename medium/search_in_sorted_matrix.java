import java.util.*;

class Program {
  public static int[] searchInSortedMatrix(int[][] matrix, int target) {
      int length = matrix[0].length - 1;
      for (int row = 0; row < matrix.length; row++) {
          if (matrix[row][length] == target) {
              return new int[]{row, length};
          }
          if (matrix[row][length] > target && matrix[row][0] <= target) {
              int left = 0;
              int right = length;
              while (left < right) {
                  int med = left + (right - left) / 2;
                  if (matrix[row][med] < target) {
                      left = med + 1;
                  } else if (matrix[row][med] > target) {
                      right = med;
                  } else {
                      return new int[]{row, med};
                  }
              }
          }
      }
      return new int[]{-1, -1};
  }
}
