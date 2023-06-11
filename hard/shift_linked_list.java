import java.util.*;

class Program {
  public static LinkedList shiftLinkedList(LinkedList head, int k) {
    if(head == null || head.next == null || k==0) return head;
    LinkedList tmp = head;
    int size = 1;
    while(tmp.next!=null){
      size++;
      tmp = tmp.next;
    }
    int newK = k%size;
    if(newK == 0) return head;
    tmp.next = head;

    LinkedList root = null;
    int stop = size-newK;

    for(int i = 0;i<= stop;i++){
      if(i==stop) {
        root = tmp.next;
        tmp.next = null;
      }
      tmp = tmp.next;
    }
    
    return root;
  }

  static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      next = null;
    }
  }
}

