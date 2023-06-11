import java.util.*;

class Program {
  public int[] threeNumberSort(int[] array, int[] order) {
    int[] res = new int[array.length];
    Map<Integer, Integer> amount = new HashMap<>();

    for (int x : array) {
        amount.merge(x, 1, Integer::sum);
    }

    int i = 0;
    for (int ord : order) {
        int atm = amount.getOrDefault(ord, 0);
        while (atm > 0) {
            res[i++] = ord;
            atm--;
        }
    }

    return res;
  }
}

