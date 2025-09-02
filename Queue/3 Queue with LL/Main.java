public class Main{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head;
        static Node tail;

        Queue(){
            head = null;
            tail = null;
        }

        public static boolean isEmpty(){
            return head == null;
        }

        public static void insert(int data){
            Node n = new Node(data);
            if(isEmpty()){
                head = tail = n;
            }else{
                tail.next = n;
                tail = n;
            }
        }

        public static void dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            head = head.next;
            System.out.println("\n"+temp.data+" removed");
        }

        public static void printQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[]args){
        Queue q = new Queue();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.printQueue();
        q.dequeue();
        q.printQueue();
    }
}