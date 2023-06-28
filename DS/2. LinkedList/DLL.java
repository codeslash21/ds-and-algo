// operations on double linked list

class Node {
  int val;
  Node prev, next;
  public Node(int val) {
    this.val = val;
  }
  public Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }
}

class DLL {
  Node head;
  int len;
  public DLL() {
    head = new Node(0);
    len=0;
  }

  // insert a node before a particular value
  public void insertBefore(int target, int val) {
    Node curr=head.next, node = new Node(val);
    while(curr!=null) {
      if(curr.val==target)
        break;
      curr=curr.next;
    }
    if(curr==null)
      return;
    node.next=curr;
    node.prev=curr.prev;
    curr.prev.next=node;
    curr.prev=node;
  }
}
