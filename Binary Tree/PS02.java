public class PS02 {
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

    public static Node leftClonedTree(Node root) {
        if (root == null)
            return null;

        Node leftCloned = leftClonedTree(root.left);
        Node rightCloned = leftClonedTree(root.right);

        Node newNode = new Node(root.val);
        root.left = newNode;
        newNode.left = leftCloned;
        root.right = rightCloned;

        return root;
    }

    public static Node backFromLeftClonedTree(Node root) {
        if (root == null)
            return null;

        Node leftOriginal = backFromLeftClonedTree(root.left.left);
        Node rightOriginal = backFromLeftClonedTree(root.right);

        root.left = leftOriginal;
        root.right = rightOriginal;

        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node newTree = new Node(50);
        newTree.left = new Node(25);
        newTree.right = new Node(75);

        leftClonedTree(newTree);
        backFromLeftClonedTree(newTree);
        inorderTraversal(newTree);
    }
}
