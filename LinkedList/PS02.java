package LinkedList;

public class PS02 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void push(int value) {
        Node newNode = new Node(value);

        newNode.next = head;

        head = newNode;
    }

    public static void pop() {
        System.out.println(head.data);
        head = head.next;
    }

    public static void main(String[] args) {
        PS02.push(10);
        PS02.push(20);
        PS02.push(30);
        PS02.push(40);

        PS02.pop();
    }
}