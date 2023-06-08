import java.util.*;

class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
    List<Integer> list = new ArrayList<>();
    int left = 0, top = 0, bot = array.length-1, right = array[0].length-1;
    int direction = 0;
    while(top<=bot && left <= right){
      if(direction==0){
        for(int i =left;i<=right;i++){
          list.add(array[left][i]);
        }
        top++;
      }
      else if(direction==1){
        for(int i =top;i<=bot;i++){
          list.add(array[i][right]);
        }
        right--;
      }
      else if(direction==2){
        for(int i =right;i>=left;i--){
          list.add(array[bot][i]);
        }
        bot--;
      }
      else {
        for(int i =bot;i>=top;i--){
          list.add(array[i][left]);
        }
        left++;
      }
      direction = (direction + 1) % 4;
    }
    return list;
  }
}

