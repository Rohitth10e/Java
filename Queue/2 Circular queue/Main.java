public class Main{
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front +=1;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int removed = arr[front];

            if(rear==front){
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            System.out.println("removed element: "+ removed);
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[]args){
        Queue q = new Queue(5);
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}