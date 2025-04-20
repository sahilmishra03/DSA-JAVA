package Tree;

import java.util.ArrayList;

public class PS07 {

    // Node class to represent a node in the binary search tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Inorder traversal to get sorted elements of BST in an ArrayList
    private static void inOrderV2(Node root, ArrayList<Integer> arrayList) {
        if (root == null) {
            return;
        }
        inOrderV2(root.left, arrayList);
        arrayList.add(root.data);
        inOrderV2(root.right, arrayList);
    }

    // Function to merge two BSTs and return a balanced BST
    public static Node mergeBSTs(Node root1, Node root2) {
        // Get inorder traversal (sorted elements) of both BSTs
        ArrayList<Integer> arr1 = new ArrayList<>();
        inOrderV2(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrderV2(root2, arr2);

        // Merge both sorted lists into a single sorted list
        int i = 0;
        int j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));  // FIXED: arr2.get(i) -> arr2.get(j)
                j++;
            }
        }

        // Add remaining elements from arr1, if any
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }

        // Add remaining elements from arr2, if any
        while (j < arr2.size()) {  // FIXED: arr1.size() -> arr2.size()
            finalArr.add(arr2.get(j));
            j++;
        }

        // Convert sorted list into a balanced BST
        return createBst(finalArr, 0, finalArr.size() - 1);
    }

    // Helper function to create a balanced BST from sorted list
    public static Node createBst(ArrayList<Integer> arrayList, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arrayList.get(mid));
        root.left = createBst(arrayList, start, mid - 1);
        root.right = createBst(arrayList, mid + 1, end);
        return root;
    }

    // Preorder traversal to print the BST
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Main method to test merging of BSTs
    public static void main(String[] args) {
        // BST1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // BST2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        // Merge the BSTs and create a balanced BST
        Node res = mergeBSTs(root1, root2);

        // Print the result using preorder traversal
        preOrder(res);
    }
}
