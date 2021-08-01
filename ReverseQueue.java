import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static Queue<Integer> reverseQueue(Queue<Integer> input) {

        Queue<Integer> queue = new LinkedList<>();
        reverseQueueRec(input,queue);
        input=queue;
        return input;
    }

    private static void reverseQueueRec(Queue<Integer> input, Queue<Integer> queue) {
        if(input.isEmpty()){
            return;
        }
        int x = input.remove();
        reverseQueueRec(input,queue);
        queue.add(x);
    }

    public static void reverseQueueAlternate(Queue<Integer> input) {
        //Your code goes
        if(input.isEmpty()){
            return;
        }
        int data=input.peek();
        input.remove();
        reverseQueueAlternate(input);
        input.add(data);

    }
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        input=reverseK(input,k);
        int i=0;
        while(i<input.size()-k){
            int y = input.peek();
            input.remove();
            input.add(y);
            i++;
        }
        return input;
    }

    static int a=0;
    public static Queue<Integer> reverseK(Queue<Integer> input,int k){
        if(a==k){
            return input;
        }
        int x= input.peek();
        input.remove();
        a++;
        reverseK(input,k);
        input.add(x);
        return input;
    }


    public static void main(String[] args){
        Queue<Integer> input = new LinkedList<>();
        for(int i=1;i<7;i++){
            input.add(i);
        }
       input = reverseQueue(input);
//        reverseQueu(input);
        while (!input.isEmpty()){
            System.out.println(input.remove());
        }
    }

}
