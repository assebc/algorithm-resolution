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

  public LinkedList nodeSwap(LinkedList head) {
    if(head == null) return null;
    if(head.next == null) return head;
    LinkedList next = head.next;
    LinkedList new_head = next.next;
    head.next.next = head;
    head.next = nodeSwap(new_head);
    return next;
  }
}

