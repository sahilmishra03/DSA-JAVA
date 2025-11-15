
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Node newTree = new Node(3);
        newTree.left = new Node(9);
        newTree.right = new Node(20);
        newTree.right.left = new Node(15);
        newTree.right.right = new Node(7);

        Queue<Node> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        queue.add(newTree);
        while (!queue.isEmpty()) {
            Node value = queue.poll();
            ArrayList<Integer> list = new ArrayList<>();
            if (value.left != null) {
                queue.add(value.left);
            }

            if (value.right != null) {
                queue.add(value.right);
            }

            list.add(value.val);
            out.add(list);
        }

        System.out.println(out);
    }
}