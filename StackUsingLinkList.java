
public class StackUsingLinkList<T> {

    private Node<T> head;
    private  int length=0;

    public int size(){
        return length;
    }
    public boolean isEmpty(){
    if(head==null){
        return true;
    }
    else
        return false;
    }
    public void push(T element){
        if(head==null){
            Node newNode=new Node(element);
            head=newNode;
            head.next=null;
            length++;
        }
        else {
            Node newNode=new Node(element);
            newNode.next=head;
            head=newNode;
            length++;
        }
    }
    public T top() throws StackEmptyException{
        if(head==null){
            StackEmptyException s = new StackEmptyException();
            throw s;
        }
        else{
            return head.data;
        }

    }
    public T pop() throws StackEmptyException{
        if(head==null){
            StackEmptyException q = new StackEmptyException();
            throw q;
        }
        T temp = head.data;
        head = head.next;
        length--;
        return temp;
    }
    public static void main(String[] args){
        StackUsingArrays<Integer> stack = new StackUsingArrays<>();
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
       // System.out.println(stack.top());
       while (stack.isEmpty()==false){
            System.out.println(stack.pop());
       }

    }
}
