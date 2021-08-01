public class QueueUsingLL<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length =0;

    public QueueUsingLL(){

    }
    public int getSize() {
        return length;
    }


    public boolean isEmpty() {
        return length==0;
    }


    public void enqueue(T data) {
        //Implement the enqueue(element) function
        if(head==null){
            Node <T> n = new Node<>(data);
            head=n;
            tail=n;
            length++;
        }
        else{
            Node <T> n = new Node<>(data);
            tail.next = n;
            tail=n;
            length++;
        }
    }


    public T dequeue() throws QueueEmptyException {
        T temp;
        if(head==null){
            throw new QueueEmptyException();
        }
        else{
            temp=head.data;
            head=head.next;
            length--;
        }
        return temp;
    }


    public T front() throws QueueEmptyException {
        if(head==null){
            throw  new QueueEmptyException();
        }
        else
            return head.data;
    }
}
