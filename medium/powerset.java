import java.util.*;

class Program {
  public static List<List<Integer>> powerset(List<Integer> array) {
    List<List<Integer>> ps = new ArrayList<>();
    powerSet(array, new ArrayList<>(), 0, ps);
    return ps;
  }

  public static void powerSet(List<Integer> s, List<Integer> ss, int p, List<List<Integer>> ps){
    ps.add(new ArrayList<>(ss));
    if(ss.size()==s.size()) return;
    for(int i = p; i<s.size();i++){
      ss.add(s.get(i));
      powerSet(s,ss,i+1,ps);
      ss.remove(ss.size()-1);
    }
  }
}

