public class QueueUsingArrays {

    private int [] data;
    private int frontindex;
    private int rearindex;
    private int size;

    public QueueUsingArrays(){
        data = new int[10];
        frontindex=-1;
        rearindex=-1;
        size=0;
    }
    public QueueUsingArrays(int capacity){
        data = new int[capacity];
        frontindex=-1;
        rearindex=-1;
        size=0;
    }

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int element){
        if (frontindex==-1){
            frontindex++;
            rearindex++;
            data[frontindex]= element;
            size++;
        }
        else if(rearindex%10<9) {
            rearindex++;
            data[rearindex]= element;
            size++;
        }
        else
        {
           data=expand(data);
           rearindex++;
           data[rearindex] = element;
           size++;
        }
    }

    private int[] expand(int[] data) {
        int [] temp = data;
        data = new int[temp.length+10];
        for (int i=0;i< temp.length;i++ ) {
            data[i]=temp[i];
        }
        return data;
    }

    public int front(){
        return data[frontindex];
    }
    public int rear(){
        return data[rearindex];
    }
    public int dequeue(){
        if (frontindex==-1){
            return -1;
        }
        int temp = data[frontindex];
        frontindex++;
        size--;
        if(size==0){
            frontindex=-1;
            rearindex=-1;
        }
        return temp;
    }
}
