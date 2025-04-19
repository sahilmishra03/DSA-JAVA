package Tree;

public class PS01 {
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

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDia = diameter(root.left);
        int lH = height(root.left);
        int rightDia = diameter(root.right);
        int rH = height(root.left);
        int selfDia = lH + rH + 1;
        return Math.max(rightDia, Math.max(leftDia, selfDia));
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(PS01.diameter(root));
    }
}
