import java.util.*;

class Program {
  // Feel free to add new properties and methods to the class.
  static class MinMaxStack {
    private static List<Integer> min = new ArrayList<>();
    private static List<Integer> max = new ArrayList<>();
    private List<Integer> stack = new ArrayList<>();
    public int peek() {
      return stack.get(stack.size()-1);
    }

    public int pop() {
      if(max.get(max.size()-1) == peek()) max.remove(max.size()-1);
      if(min.get(min.size()-1) == peek()) min.remove(min.size()-1);
      return stack.remove(stack.size()-1);
    }

    public void push(Integer number) {
      if(stack.isEmpty()){
        min.add(number);
        max.add(number);
      } else{
        if(number>= max.get(max.size()-1)) max.add(number);
        if(number<=min.get(min.size()-1)) min.add(number);
      }
      stack.add(number);
    }

    public int getMin() {
      return min.get(min.size()-1);
    }

    public int getMax() {
      return max.get(max.size()-1);
    }
  }
}

