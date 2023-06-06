import java.util.*;

class Program {

  public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // 1 -> col 0 won | 0 -> col 1 won
    Map<String,Integer> team_points = new HashMap<>();
    for(int i = 0; i<competitions.size();i++){
      for(String team: competitions.get(i)){
        if(!team_points.containsKey(team)){
          team_points.put(team,0);
        }
      }
      String won = competitions.get(i).get(Math.abs(results.get(i)-1));
      team_points.merge(won, 3, Integer::sum);
    }
    return team_points.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
  }
}

