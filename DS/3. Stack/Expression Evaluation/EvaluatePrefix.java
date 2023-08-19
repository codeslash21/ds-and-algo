// evaluate prefix expression
class EvaluatePrefix {
  static int evaluatePrefix(String exp) {
    Stack<Integer> stack = new Stack<>();
    for(int i=exp.length()-1;i>=0;i--) {
      char c=exp.charAt(i);
      if(c==' ')
        continue;
      if(Character.isDigit(c)) {
        int num=0, j=i;
        while(Character.isDigit(c)) {
          i--;
          c=exp.charAt(i);
        }
        i++;
        for(int k=i;k<=j;k++) {
          num=num*10+(int)(exp.charAt(k)-'0');
        }
        stack.push(num);
      }
      else {
        int op1=stack.pop();
        int op2=stack.pop();
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
