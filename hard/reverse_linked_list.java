import java.util.*;

class Program {
  public static LinkedList reverseLinkedList(LinkedList head) {
    return rec_swap(null, head);
  }
  public static LinkedList rec_swap(LinkedList prev, LinkedList curr){
    if(curr == null) return prev;
    LinkedList next = curr.next;
    curr.next = prev;
    return rec_swap(curr,next);
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}

