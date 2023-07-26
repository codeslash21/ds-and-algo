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

public class DLL {
  // insert a node before a particular value
  public static Node insertBefore(Node head, int target, int val) {
    Node curr=head, node = new Node(val);
    if(head=null)
      return;
    if(head.val==target) {
      node.next=head;
      head.prev=node;
      head=node;
      return head;
    }
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
    return head;
  }

  // delete a particular node by value
  public static void deleteNode(Node head, int target) {
    if(head==null)
      return;
    Node dummy = new Node(0, head), curr=head;
    while(curr!=null) {
      if(curr.val==target) {
        curr.next
}
