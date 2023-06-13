import java.util.*;

class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    LinkedList tmp = head;
    int size = 0;
    while(tmp!=null) { size++; tmp = tmp.next; }
    if(size < k) return;
    else if(size == k){
      head.value = head.next.value;
      head.next = head.next.next;
      return;
    } else {
      int index = size - k;
      tmp = head;
      int pos = 0;
      while(pos<index-1) {tmp = tmp.next; pos++;}
      tmp.next = tmp.next.next;
    }
    
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}

