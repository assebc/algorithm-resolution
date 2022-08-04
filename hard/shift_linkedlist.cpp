using namespace std;

class LinkedList {
public:
  int value;
  LinkedList *next;

  LinkedList(int value) {
    this->value = value;
    next = nullptr;
  }
};

LinkedList *shiftLinkedList(LinkedList *head, int k) {
  if(!head || !head->next || k==0) return head;
  LinkedList *aux = head;
  int len = 1;
  
  //find length
  while(aux->next){
    len++;
    aux = aux->next;
  }
  
  aux->next = head;
  k = k%len;
  k = len-k;
  while(k--){
    aux = aux->next;
  }
  head = aux->next;
  aux->next = NULL;
  
  return head;
}