package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int data = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return data;
    }

    public int searchI(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int searchR(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int removeMiddle(int key) {
        if (size == 0) {
            System.out.println("LL IS EMPTY");
            return -1;
        }
        Node prev = head;
        while (prev.next.data != key) {
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    public void removeFromLast(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node FindMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(Node head) {
        String s1 = "";
        Node temp = head;
        while (temp != null) {
            int num = temp.data;
            String sHelp = String.valueOf(num);
            s1 += sHelp;
            temp = temp.next;
        }
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }

        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public boolean isPalindromeV2(Node head) {
        StringBuilder s1 = new StringBuilder();
        Node temp = head;

        while (temp != null) {
            s1.append(temp.data);
            temp = temp.next;
        }

        String s2 = s1.reverse().toString();
        s1.reverse();

        if (s1.toString().equals(s2)) {
            return true;
        }
        return false;
    }

    public boolean isPalindromeV3(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
    
        Node midNode = FindMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    
        Node left = head;
        Node right = prev; 
    
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.isPalindromeV3(head));
    }
}
