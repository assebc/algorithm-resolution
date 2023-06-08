import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    List<Integer[]> res = new ArrayList<>();
    for(int i = 0;i<array.length-2;i++){
     int left = i+1;
     int right = array.length-1;
     while(left<right){
       int currentSum = array[i] + array[left] + array[right];
       if(currentSum == targetSum){
         Integer[] tmp = {array[i],array[left],array[right]};
         res.add(tmp);
         left++;right--;
       } else if(currentSum<targetSum) left++;
       else if (currentSum>targetSum) right--;
     }
    }
    return res;
  }
}

