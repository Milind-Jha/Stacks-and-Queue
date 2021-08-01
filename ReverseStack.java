import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
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
}
