package Queue;

class MyCustomQueue {
    int[] customQueue;
    int front;
    int rear;
    int size;

    MyCustomQueue(int size) {
        this.customQueue = new int[size];
        this.front = 1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == customQueue.length - 1;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int data = customQueue[front];
        front++;
        System.out.println("Data removed " + data);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear = rear + 1;
        customQueue[rear] = data;
        System.out.println("Data Inserted");
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(customQueue[i]);
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        MyCustomQueue queue = new MyCustomQueue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.show();
        queue.pop();
        queue.show();
    }
}
