import java.util.Stack;

public class QueueUsing2Stack <T>{

    private Stack<T> stack1;
    private Stack<T> stack2;
    private int count;

    public QueueUsing2Stack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        count =0;
    }
    public int size(){
        return count;
    }
    public void enque(T element){
        stack1.push(element);
        count++;
    }
    public T deque(){
        while (stack1.size()>1){
            T temp = stack1.pop();
            stack2.push(temp);
        }
        T ans = stack1.pop();
        while (!stack2.isEmpty()){
            T temp = stack2.pop();
            stack1.push(temp);
        }
        count--;
        return ans;
    }
    public T front(){
        while (stack1.size()>1){
            T temp = stack1.pop();
            stack2.push(temp);
        }
        T ans = stack1.pop();
        stack2.push(ans);
        while (!stack2.isEmpty()){
            T temp = stack2.pop();
            stack1.push(temp);
        }
        return ans;
    }
}
