// operations on single linked list - insert, selete, search

class Node {
  int val;
  Node next;
  public Node(int val) {
    this.val = val; 
  }
  public Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }
}

class LL {
  Node head;
  int len;
  // constructor
  public LL() {
    head = new Node(0);
    len=0;
  }
  
  // insert before a particular index. 0 based indexing
  public void insertAtPosition(int index, int val) {
    if(index>=len || index<0)
        return;
    Node prev=head, node = new Node(val);
    for(int i=0;i<index;i++)
        prev=prev.next;
    node.next=prev.next;
    prev.next=node;
    len++
  }
  
  // insert before a particular value
  public void insertBeforeVal(int target, int val) {
    Node prev=head, node = new Node(val);
    while(prev.next!=null) {
      if(prev.next.val==target)
        break;
      prev=prev.next;
    }
    // target value not found
    if(prev.next==null)
      return;
    // target value found
    node.next=prev.next;
    prev.next=node;
    len++;
  }
  
  // insert after a particular value
  public void insertAfterVal(int target, int val) {
    Node curr=head.next, node = new Node(val);
    while(curr!=null) {
      if(curr.val==target)
        break;
      curr=curr.next;
    }
    if(curr==null)  // value not found
      return;
    node.next=curr.next;
    curr.next=node;
    len++;
  }

  // delete node with a particular value
  public void delete(int target) {
    Node prev=head;
    while(prev.next!=null) {
      if(prev.next.val==target)
        break;
      prev=prev.next;
    }
    if(prev.next==null)
      return;
    prev.next=prev.next.next;
    len--;
  }

  // delete node at a particular index
  public void deleteAtIndex(int index) {
    if(index<0 || index>=len)
      return;
    Node prev=head;
    for(int i=0;i<index;i++)
      prev=prev.next;
    prev.next=prev.next.next;
    len--;
  }

  // find a node with a particular value
  public Node searchNode(int target) {
    Node curr=head.next;
    while(curr!=null) {
      if(curr.val==target)
        return curr;
      curr=curr.next;
    }
    return null;
  }
}
