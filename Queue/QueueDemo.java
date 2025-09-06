package Queue;

public class QueueDemo {
    static int arr[];
    static int size;
    static int rear = -1;;

    QueueDemo(int size) {
        arr = new int[size];
        // this.size = size;
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    public static void add(int x) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }

        rear++;
        arr[rear] = x;
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int front = arr[0];

        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;

        return front;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int front = arr[0];

        return front;
    }

    public static void main(String[] args) {
        // QueueDemo queue = new QueueDemo(5);
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
    }
}