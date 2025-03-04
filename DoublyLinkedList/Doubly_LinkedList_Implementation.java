package DoublyLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly_LinkedList_Implementation {
    private Node head;
    private Node tail;

    public Doubly_LinkedList_Implementation() {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        Node prevNode = tail.prev;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = tail;
        tail.prev = newNode;
    }

    public void printList() {
        Node current = head.next;
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Doubly_LinkedList_Implementation list = new Doubly_LinkedList_Implementation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes to add:");
        int n = sc.nextInt();

        System.out.println("Enter the data for the nodes:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.addNode(data);
        }

        System.out.println("The contents of the doubly linked list are:");
        list.printList();
    }
}
