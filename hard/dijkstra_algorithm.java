import java.util.*;

class Program {
  public int[] dijkstrasAlgorithm(int start, int[][][] edges) {

    int [] res = new int[edges.length];
    Arrays.fill(res, -1);
    PriorityQueue<Item> q = new PriorityQueue<>(Comparator.comparingInt(o -> (o.total)));
    Set<Integer> visited = new HashSet<>();

    for(int [] edge : edges[start])
      q.offer(new Item(edge[0], edge[1]));

    res[start] = 0;
    visited.add(start);
    while(visited.size()<edges.length && !q.isEmpty()){
      Item next = q.poll();
      if(visited.contains(next.id)) continue;

      visited.add(next.id);

      res[next.id] = next.total;
      for(int [] edge:edges[next.id]){
        if(!visited.contains(edge[0])) q.offer(new Item(edge[0], edge[1] + next.total));
      }
    }
    return res;
 
  }

  public static class Item{
    public int id;
    public int total;

    public Item(int id, int total){
      this.id = id;
      this.total = total;
    }
  }
}

