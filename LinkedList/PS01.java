package LinkedList;

import java.util.HashSet;

public class PS01 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode tNode = head;
        HashSet<Integer> set = new HashSet<>();
        while (tNode != null) {
            set.add(tNode.val);
            tNode = tNode.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : set) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
