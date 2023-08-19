// Find infix epression from the given postfix exrpression using stack
class PostfixToInfix {
  static boolean isOperand(char c) {
    return (c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z');
  }
  static String postfixInfix(String exp) {
    Stack<String> stack = new Stack<>();
      for(int i=0;i<exp.length;i++) {
        char c = exp.charAt(i);
        if(isOperand(c))
          stack.push(c+"");
        else {
          String op2=stack.peek();
          stack.pop();
          String op1=stack.peek();
          stack.pop();
          stack.push("("+op1+c+op2+")");
        }
      }
    return stack.peek();
  }
}
