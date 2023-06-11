import java.util.*;

class Program {
  public int[] missingNumbers(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for(int i = 1; i<= nums.length+2;i++) set.add(i);
    for(int num:nums) set.remove(num);
    List<Integer> list = new ArrayList<>(set);
    return new int[]{list.get(0),list.get(1)};
  }
}

