import java.util.*;

public class StackLinkedList<T> {
  private class Node<T> {
    T data;
    Node link;
  }
  Node top;
  StackLinkedList() {
    top=null;
  }
  public void push(T val) {
    Node temp = new Node();
    if(temp==null) {
      System.out.println("Heap Overflow");
      return;
    }
    temp.data = val;
    temp.link=top;
    top=temp;
  }
  public boolean isEmpty() {
    return top==null;
  }
  public T peek() {
    if(top==null) {
      System.out.println("No element is present");
      return;
    }
    else {
      return top.data;
    }
  }
  public void pop() {
    if(top==null) {
      System.out.println("Stack underflow");
    }
    else {
      top=top.link;
    }
  }
