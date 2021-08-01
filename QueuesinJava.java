import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueuesinJava {

    Queue<Integer> queue = new LinkedList<Integer>();
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();
        System.out.println(q.add(2));
        System.out.println(q.add(13));
        System.out.println(q.add(6));
        System.out.println(q.add(9));

        System.out.println(q.size());
    }
}
