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

  public LinkedList middleNode(LinkedList linkedList) {
    LinkedList tmp = linkedList;
    LinkedList tmp2 = linkedList;
    while (tmp != null && tmp.next != null){
      tmp2 = tmp2.next;
      tmp = tmp.next.next;
    }
    return tmp2;
  }
}

