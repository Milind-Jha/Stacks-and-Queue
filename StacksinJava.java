import java.util.Stack;

public class StacksinJava {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
//        System.out.print(stack.pop()+stack.size());
        System.out.println(stack.pop());
        System.out.print(stack.size());
//        int [] x ={2,31,4,3,6,1};
//        for (int q:x) {
//            stack.push(q);
//        }
//
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
//        System.out.println(stack.isEmpty());
    }
}
