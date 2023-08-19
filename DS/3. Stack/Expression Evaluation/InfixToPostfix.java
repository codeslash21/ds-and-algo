// Infix to postfix evaluation
import java.util.*;

class InfixToPostfix {
  static int prec(char c) {
    switch(c) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
    }
    return -1;
  }
  static String infixPostfix(String exp) {
    String result = new String("");
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<exp.length();i++) {
      char c = exp.charAt(i);
      if(Character.isLetterOrDigit(c))
        result+=c;
      else if(c=='(')
        stack.push(c);
      else if(c==')') {
        while(!stack.isEmpty() && stack.peek()!='(') {
          result+=stack.peek();
          stack.pop();
        }
        stack.pop();
      }
      else {
        while(!stack.isEmpty() && prec(stack.peek())>=prec(c)) {
          result+=stack.peek();
          stack.pop();
        }
        stack.push(c);
      }
    }
    while(!stack.isEmpty()) {
      result+=stack.peek();
      stack.pop();
    }
    return result;
  }
}
