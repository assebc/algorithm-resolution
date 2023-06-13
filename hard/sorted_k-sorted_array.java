import java.util.*;

class Program {

  public int[] sortKSortedArray(int[] array, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    k++;
    int index = 0;
    for(int i = 0; i< array.length;i++){
      queue.add(array[i]);
      if(queue.size() == k) array[index++] = queue.poll();
    }
    while(index < array.length) array[index++] = queue.poll();
    return array;
  }
}

