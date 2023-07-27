import java.util.*;

class StackArray<T> {
  ArrayList<T> stack;
  int size;
  StackArray(int size) {
    this.size=size;
    stack = new ArrayList<T>(size);
  }
  void push(T val) {
    if(top+1==size) {
      System.out.println("Stack overflow");
    }
    else {
      top+=1;
      if(stack.size()>top) {
        stack.set(top, val);
      }
      else {
        stack.add(val);
      }
    }
  }
  T top() {
    if(top==-1) {
      System.out.println("Stack underflow");
      return null;
    }
    else {
      stack.get(top);
    }
  }
  void pop() {
    if(top==-1) {
      Systemout.println("Stack underflow");
    }
    else {
      top--;
    }
  }
}
    
