public class Main {
    public static void main(String[] args) throws QueueEmptyException {

//        QueueUsingArrays queue = new QueueUsingArrays();
//        for(int i=1;i<25;i++){
//            queue.enqueue(i);
//        }
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.front());
//        System.out.println(queue.rear());
//        System.out.println("Size before dequeue = "+queue.length());
//        while (!queue.isEmpty()){
//            System.out.print(queue.dequeue()+"\t");
//            System.out.println("Size after dequeue = "+queue.length());
//        }

//        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
//        for (int i=1;i<7;i++){
//            queue.enqueue(i);
//        }
//        System.out.println(queue.front());
//        System.out.println("SIZE: "+ queue.getSize());
//        while (!queue.isEmpty()){
//            System.out.println(queue.dequeue());
//        }
//        System.out.println("SIZE: "+ queue.getSize());

        QueueUsing2Stack<Integer> queue = new QueueUsing2Stack<>();
        for (int i=1;i<5;i++){
            queue.enque(i);
        }
        System.out.println(queue.front());
        System.out.println("Size:-"+queue.size());
        while (queue.size()!=0){
            System.out.println(queue.deque());
        }

    }
}
