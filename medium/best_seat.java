import java.util.*;

class Program {

  public int bestSeat(int[] seats) {
    int best = -1, max_space = 1, space = 0;
    for(int i = 1; i<seats.length;i++){
      if(seats[i] == 1){
        int places = i - space;
        if(max_space < places){
          max_space = places;
          best = (i+space) / 2;
        }
        space = i;
      }
    }
    return best;
  }
}

