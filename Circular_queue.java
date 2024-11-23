import java.util.*;
public class Circular_queue {
    public static class queue {
        static int rear;
        static int front;
        static int size;
        static int arr[];
        static int n;

        queue(int n) {
            arr = new int[n];
            front = -1;
            rear = -1;
            size = n;

        }

        //if queue is empty
        public static boolean Isempty() {
            return rear == -1 && front == -1;

        }

        public static boolean Isfull() {
            return (rear + 1) % size == front;

        }

        //add in queue
        public static void add(int data) {
            if (Isfull()) {
                System.out.println("queue is full");
            } else {
                if(front==-1){
                    front=0;
                }
                rear = (rear + 1) % size;
                arr[rear] = data;
            }
        }

        //remove from the queue
        public static int remove() {
            if (Isempty()) {
                System.out.println("our list is empty");
            }
            int result = arr[front];
            //if we remove the last element of the list
            if (front == rear) {
                front = rear = -1;
            } else {
                front= (front + 1) % size;
            }
            return result;
        }

        //peek
        public static int peek() {
            if (Isempty()) {
                System.out.println("queue empty");
                return -1;
            }
            int top = arr[front];
            return top;

        }

        //print queue
        public static void print() {
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);

            }


        }

        public static void main(String args[]) {
            queue q = new queue(5);
            q.add(45);
            q.add(56);
            q.add(77);
           int b=q.remove();
            System.out.println(b+"remove");
            q.add(6);
            q.add(8);
            int c=q.remove();
            System.out.println(c+"remove");
            print();


        }
    }
}


