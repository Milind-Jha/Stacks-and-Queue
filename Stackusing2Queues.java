import java.util.LinkedList;
import java.util.Queue;

public class Stackusing2Queues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;


    public Stackusing2Queues(){
        queue1 =  new LinkedList<>();
        queue2 = new LinkedList<>();

    }
    public int getSize() {
        return this.queue1.size();
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public void push(int element) {
        this.queue1.add(element);
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        while (this.queue1.size()>1){
            int x = this.queue1.poll();
            this.queue2.add(x);
        }
        int ans = queue1.remove();


        while (!queue2.isEmpty()){
            int x = queue2.remove();
            queue1.add(x);
        }

        return ans;
    }
    public int top() {
        if (this.isEmpty()) {
            return -1;
        }
        while (queue1.size()>1){
            int x = queue1.poll();
            queue2.add(x);
        }
        int ans = queue1.poll();
        queue2.add(ans);

        while (!queue2.isEmpty()){
            int x = queue2.remove();
            queue1.add(x);
        }
        return ans;
    }
 }
