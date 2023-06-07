import java.util.*;

class Program {

  public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    Collections.sort(redShirtHeights);
    Collections.sort(blueShirtHeights);
    int sizes [] = new int[redShirtHeights.size()];
    for(int i =0;i<redShirtHeights.size();i++){
      if(redShirtHeights.get(i)<blueShirtHeights.get(i)) sizes[i] = -1;
      else if (redShirtHeights.get(i)==blueShirtHeights.get(i)) sizes[i] = 0;
      else sizes[i] = 1;
    }
    return Math.abs(Arrays.stream(sizes).sum())==redShirtHeights.size();
  }
}
