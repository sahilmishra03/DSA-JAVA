public class PS04 {
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

    public static void inorderTraversal(Node root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static Node removeLeaveNodes(Node root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return null;
        }

        root.left = removeLeaveNodes(root.left);
        root.right = removeLeaveNodes(root.right);
        return root;
    }

    public static void main(String[] args) {
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
        newTree.right.left.right = new Node(70);

        inorderTraversal(newTree);
        System.out.println();
        removeLeaveNodes(newTree);
        inorderTraversal(newTree);
    }
}
