// Evaluate postfix expression
class EvaluatePostfix {
  static int evaluatePostfix(String exp) {
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<exp.length();i++) {
      char c = exp.charAt(i);
      if(c==' ') // ' ' is the seperator between two operands
        continue;
      if(Character.isDigit(c)) {
        int num=0;
        while(Character.isDigit(c)) {
          n=n*10+(int)(c-'0');
          i++;
          c=exp.charAt(i);
        }
        stack.push(num);
        i--;
      }
      else {
        int op2=stack.pop();
        int op1=stack.pop();
        switch(c) {
          case '+':
            stack.push(op1+op2);
            break;
          case '-':
            stack.push(op1-op2);
            break;
          case '*':
            stack.push(op1*op2);
            break;
          case '/':
            stack.push(op1/op2);
            break;
        }
      }
    }
    return stack.pop();
  }
}
