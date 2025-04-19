package Tree;

import java.util.ArrayList;

public class PS05 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;

        path.add(root);

        if (root.data == n)
            return true;

        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {// O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i))
                break;
        }
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 7;

        System.out.println(lca(root, n1, n2).data);
    }
}
