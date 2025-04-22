package Tree;

import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private static void inOrderV2(Node root, ArrayList<Integer> arrayList) {
        if (root == null) {
            return;
        }
        inOrderV2(root.left, arrayList);
        arrayList.add(root.data);
        inOrderV2(root.right, arrayList);
    }

    public static boolean search(Node root, int key) { // O(h)
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delNode(Node root, int key) {
        if (root.data < key) {
            root.right = delNode(root.right, key);
        } else if (root.data > key) {
            root.left = delNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delNode(root.right, Is.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.println(root.data);
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static boolean isValidBST(Node root) {
        if (root == null) {
            return true;
        }

        ArrayList<Integer> res = new ArrayList<>();
        inOrderV2(root, res);

        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) >= res.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node ls = invertTree(root.left);
        Node rs = invertTree(root.right);

        root.left = rs;
        root.right = ls;

        return root;
    }

    private static Node createBst(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(nums[mid]);
        root.left = createBst(nums, start, mid - 1);
        root.right = createBst(nums, mid + 1, end);
        return root;
    }

    public static Node sortedArrayToBST(int[] nums) {
        return createBst(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

    }
}
