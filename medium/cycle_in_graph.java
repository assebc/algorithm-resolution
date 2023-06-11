import java.util.*;

class Program {

  public boolean cycleInGraph(int[][] edges) {
    for(int v = 0; v<edges.length;v++){
      if(dfs(edges,v,new HashSet<>())) return true;
    }
    return false;
  }

  public boolean dfs(int [][] edges, int vertex, Set<Integer> visited){
    if(visited.contains(vertex)) return true;
    visited.add(vertex);
    for(int edge: edges[vertex]){
      if(dfs(edges, edge, visited)) return true;
    }
    visited.remove(vertex);
    return false;
  }
  
}

