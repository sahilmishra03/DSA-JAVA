public class PS03 {
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

    public static void nodeWithSingleChild(Node root){
        if (root==null) {
            return;
        }

        if (root.left==null && root.right!=null){
            System.out.println(root.val);
        } else if (root.left!=null && root.right==null) {
            System.out.println(root.val);      
        }

        nodeWithSingleChild(root.left);
        nodeWithSingleChild(root.right);
    }
    public static void main(String[] args) {
        Node newTree = new Node(50);
        newTree.left = new Node(25);
        newTree.right = new Node(75);
        newTree.left.left = new Node(12);
        newTree.left.right = new Node(37);
        newTree.right.left = new Node(62);
        newTree.left.right.left = new Node(30);
        newTree.right.left.right = new Node(70);

        nodeWithSingleChild(newTree);

    }
}
