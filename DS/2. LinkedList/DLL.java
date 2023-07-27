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
  // insert at head
  public static Node insertAtHead(Node head, int val) {
    Node node = new Node(val);
    node.next=head;
    node.prev=null;
    if(head!=null)
      head.prev=node;
    return head;
  }
  // insert at the end of LL
  public static Node insertAtEnd(Node head, int val) {
    Node node =  new Node(val);
    Node curr=head;
    if(curr!=null) {
      while(curr.next!=null)
        curr=curr.next;
      curr.next=node;
      node.next=null;
      node.prev=curr;
    }
    else {
      head=node;
    }
    return head;
  }

  // insert node after a particular value
  public static Node insertAfterValue(Node head, int data, int target) {
    Node node = new Node(data);
    Node curr=head;
    while(curr!=null) {
      if(curr.val==target) {
        node.next=curr.next;
        curr.next.prev=node;
        node.prev=curr;
        curr.next=node;
        return head;
      }
      curr=curr.next;
    }
    System.out.println(target+" not present in the list.");
    return head;
  }

  // delete a node with given value from LL
  public static Node deleteNode(Node head, int val) {
    if(head==null) {
      System.out.println("List is empty.");
      return head;
    }
    Node dummy = new Node(0);
    dummy.next=head;
    head.prev=dummy;
    Node curr=dummy.next;
    while(curr!=null) {
      if(curr.val==val) {
        curr.prev.next=curr.next;
        if(curr.next!=null)
          curr.next.prev=curr.prev;
        if(dummy.next!=null)
          dummy.next.prev=null;
        return dummy.next;
      }
      curr=curr.next;
    }
    System.out.println(val+" is not present in the list.");
    return head;
  }
   
