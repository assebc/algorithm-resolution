import java.util.*;

class Program {
  public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {
    List<Integer> res = new ArrayList<>();
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    for(List<Integer> tmp : arrays) queue.addAll(tmp);
    while(!queue.isEmpty()) res.add(queue.poll());
    return res;
  }
}

