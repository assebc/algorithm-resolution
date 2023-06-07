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

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    LinkedList tmp = linkedList;
    if(tmp!= null){
        while(tmp.next!=null){
          if(tmp.value==tmp.next.value){
            tmp.next = tmp.next.next;
          } else tmp = tmp.next;
        }
    }
    return linkedList;
  }
}

