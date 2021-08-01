import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedExpression {
    public static boolean isBalanced(String expression) {
        if (expression.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < expression.length(); i++)
        {
            char current = expression.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return false;
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();

    }
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        //Your code goes here
        if (input.isEmpty()){
            return;
        }
        int x= input.pop();
        reverseStack(input,extra);
        while (!input.isEmpty()){
            int y = input.pop();
            extra.push(y);
        }
        input.push(x);
        while (!extra.isEmpty()) {
            int z = extra.pop();
            input.push(z);
        }
    }
    public static boolean checkRedundantBrackets(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    count++;
                    stack.pop();
                }
                stack.pop();
                if (count == 0 || count == 1) {
                    return true;
                }
            } else {
                stack.push(input.charAt(i));
            }
        }
        return false;
    }
    public static int countBracketReversals(String input) {
        if(input.length()%2==1){
            return -1;
        }
        int count =0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='{'){
                stack.push(input.charAt(i));
            }
            if(input.charAt(i)=='}'){
                if(stack.isEmpty()){
                   stack.push(input.charAt(i));
                }
                else if(stack.peek()=='}'){
                    stack.push(input.charAt(i));
                }
                else if(stack.peek()=='{'){
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()){
            char x = stack.pop();
            char y = stack.pop();
            if(x==y){
                count++;
            }
            else{
                count=count+2;
            }
        }
        return count;
    }
}
