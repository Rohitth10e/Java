import java.util.*;

public class Main{
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
            }else{
                while(!s1.isEmpty()){
                    int ele = s1.pop();
                    s2.push(ele);
                }
                s1.push(data);
                while(!s2.isEmpty()){
                    int ele = s2.pop();
                    s1.push(ele);
                }
            }
        }

        public static void remove(){
            if(s1.isEmpty()){
                System.out.println("queue/stack is empty");
                return;
            }
            int ele = s1.pop();
            System.out.println("popped ele: "+ele);
        }

        public static void printQueue(){
            while(!s1.isEmpty()){
                System.out.print(s1.pop()+" ");
            }
        }
    }
    public static void main(String[]args){
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
//        q.printQueue();
        q.remove();
        q.printQueue();
    }
}