package Queue;

public class CircularQueueImplementationArray {
    static class CircularInnerQueueImplementationArray {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CircularInnerQueueImplementationArray(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && rear == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularInnerQueueImplementationArray circularQ = new CircularInnerQueueImplementationArray(3);
        circularQ.add(1);
        circularQ.add(2);
        circularQ.add(3);
        // System.out.println(circularQ.remove());
        circularQ.remove();
        circularQ.add(4);
        // System.out.println(circularQ.remove());
        circularQ.remove();
        
        while (!circularQ.isEmpty()) {
            System.out.println(circularQ.peek());
            circularQ.remove();
        }
    }
}