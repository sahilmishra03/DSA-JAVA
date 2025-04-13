package Tree;

public class BinaryTree {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    Node root;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.print(bt.root);
    }

    void createBinaryTree() {
        root = new Node(50);
        root.leftNode = new Node(25);
        root.rightNode = new Node(55);
        root.leftNode.leftNode = new Node(35);
        root.leftNode.rightNode = new Node(44);
        root.rightNode.leftNode = new Node(95);
        root.rightNode.rightNode = new Node(62);
        root.leftNode.rightNode.leftNode = new Node(11);
    }

    void print(Node root) {
        if (root == null) {
            return;
        }
        String left;
        String right;

        if (root.leftNode != null) {
            left = Integer.toString(root.leftNode.data);
        } else {
            left = "null";
        }
        if (root.rightNode != null) {
            right = Integer.toString(root.rightNode.data);
        } else {
            right = "null";
        }
        System.out.println(left + "-->" + root.data + "<--" + right);
        print(root.leftNode);
        print(root.rightNode);
    }
}
