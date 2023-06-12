import java.util.*;

class Program {

  public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
    if(k==0) return new ArrayList<>();
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> index = new ArrayList<>();

    for(int i = 0;i<2*k;i++) index.add(i);
    
    Collections.sort(index, Comparator.comparingInt(tasks::get));

    int i = 0, j = (k*2)-1;

    while(i<j){
      ArrayList<Integer> tmp = new ArrayList<>();
      tmp.add(index.get(i++));
      tmp.add(index.get(j--));
      res.add(tmp);
    }
    return res;
  }
}

