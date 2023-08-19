// convert infix expression to prefix expression
class InfixToPrefix {
  static String reverseString(String str) {
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    return sb.toString();
  }
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
  static String infixToPostfix(String exp) {
    Stack<Character> stack = new Stack<>();
    String result = new String("");
    for(int i=0;i<exp.length();i++) {
      char c=exp.charAt(i);
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
        while(!stack.isEmpty() && prec(c)<=prec(stack.peek())) {
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
  static String infixToPrefix(String exp) {
    exp=reverseString(exp);
    exp=infixToPostfix(exp);
    exp=reverseString(exp);
    return exp;
  }
}
