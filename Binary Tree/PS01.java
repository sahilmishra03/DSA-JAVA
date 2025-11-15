
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PS01 {
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

    static ArrayList<Integer> list;

    public static boolean searchBT(Node root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            list.add(root.val);
            return true;
        }

        boolean leftSearch = searchBT(root.left, val);
        if (leftSearch) {
            list.add(root.val);
            return true;
        }

        boolean rightSearch = searchBT(root.right, val);
        if (rightSearch) {
            list.add(root.val);
            return true;
        }
        return false;
    }

    public static void kleveldown(Node root, int k) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                if (level == k) {
                    System.out.print(curr.val + " ");
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            level++;
        }
    }

    public static void pathHelper(Node root, int sum, List<String> out, int low, int high) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            sum += root.val;
            if (sum >= low && sum <= high) {
                out.add(root.val + "");
            }
            System.out.println(out);
            return;
        }

        sum = sum + root.val;
        pathHelper(root.left, sum, out, low, high);
        pathHelper(root.right, sum, out, low, high);
    }

    public static boolean pathsHelper(Node root, ArrayList<Integer> temp, int target) {
        if (root == null)
            return false;

        if (root.val == target) {
            temp.add(root.val);
            return true;
        }
        boolean left = pathsHelper(root.left, temp, target);
        if (left) {
            temp.add(root.val);
            return true;
        }
        boolean right = pathsHelper(root.right, temp, target);
        if (right) {
            temp.add(root.val);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        list = new ArrayList<>();
        Node newTree = new Node(50);
        newTree.left = new Node(25);
        newTree.right = new Node(75);
        newTree.left.left = new Node(12);
        newTree.left.right = new Node(37);
        newTree.right.left = new Node(62);
        newTree.right.right = new Node(87);
        newTree.left.right.left = new Node(30);
        newTree.left.right.right = new Node(40);
        newTree.right.left.left = new Node(60);
        newTree.right.left.left = new Node(70);

        pathHelper(newTree, 0, new ArrayList<>(), 100, 250);
    }
}
