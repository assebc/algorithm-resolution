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

  public LinkedList mergingLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
    LinkedList tmp1 = linkedListOne;
    LinkedList tmp2 = linkedListTwo;
    while(tmp1 != tmp2){
      tmp1 = (tmp1 == null) ? linkedListTwo : tmp1.next;
      tmp2 = (tmp2 == null) ? linkedListOne : tmp2.next;
    }
    return tmp1;
  }
}

