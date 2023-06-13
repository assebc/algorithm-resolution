import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
    LinkedList tmp1 = linkedListOne;
    LinkedList tmp2 = linkedListTwo;
    int val1 = 0, val2 = 0, size = 1;
    while(tmp1!=null){
      val1 += size * tmp1.value;
      tmp1 = tmp1.next;
      size *= 10;
    }
    size = 1;
    while(tmp2!=null){
      val2 += size * tmp2.value;
      tmp2 = tmp2.next;
      size *= 10;
    }
    int result = val1 + val2;
    int[] result_aux = new int[String.valueOf(result).length()];
    int i = 0;
    while(result>0){
      result_aux[i++] = result%10;
      result/=10;
    }
    LinkedList res = new LinkedList(result_aux[0]);
    LinkedList tmp = res;
    for(int j = 1; j<result_aux.length;j++){
      tmp.next = new LinkedList(result_aux[j]);
      tmp = tmp.next;
    }
    return res;
  }
}

