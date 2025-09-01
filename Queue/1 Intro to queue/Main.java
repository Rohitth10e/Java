// we can implement queue in : 1.arrays 2.Linkedlist 3.stack

// array

public class Main{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;

            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //add
        public static void add(int data){
            if(rear ==  size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        //remove
        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int ele = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            System.out.println("Popped element " + ele);
        }

        //print queue
        public static void printQueue(){
            for(int i=0;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[]args){
        Queue q = new Queue(5);
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        q.printQueue();
        q.remove();
        q.printQueue();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}