public class StackUsingArrays<I extends Number> {

    private int [] data;
   private int topindex;
   public StackUsingArrays(){
       data = new int[10];
       topindex=-1;
   }
   public int size(){
       return topindex+1;
   }
   public boolean isEmpty(){
       if(topindex==-1){
           return true;
       }
       else
           return false;
   }
   public void push(int element){
       if(topindex%10!=9){              //if element is pushed at top index = -1 i.e. for element at 1st pos  data[0]
           data[topindex+1]=element;    //data[top index+1] = data[-1+1]=data[0] for element at 1st position.
           topindex++;
       }
       else {                           //if top index = 9 , 19 , 29 ... array is full size= 10,20,30...
          data = expand(data);          //so we expand array by 10 more elements
          data[topindex+1]=element;
          topindex++;
       }
   }
   public int top(){
       if(topindex==-1){
           return -1;
       }
       else
       return data[topindex];
   }
   public int pop(){
       if(topindex==-1){
           return -1;
       }
       topindex--;
       return data[topindex];
   }
    private int[] expand(int[] data) {
       int [] temp = data;
       data = new int[size()+10];
       for(int i=0;i<temp.length;i++){
           data[i]=temp[i];
       }
       return data;
    }
    public static void main(String[] args){
       StackUsingArrays one = new StackUsingArrays();
        System.out.println(one.isEmpty());
        for(int i = 0 ; i < 25; i++){
            one.push(i);
        }
        System.out.println(one.isEmpty());
        System.out.println(one.top());
        System.out.println(one.size());
        System.out.println(one.pop());
        System.out.println(one.top());
        System.out.println(one.size());
        for ( int i: one.data ) {
            System.out.print(i+"\t");
        }
    }
}
