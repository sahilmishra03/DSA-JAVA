package Tree;

import java.util.ArrayList;
import java.util.List;

public class PS09 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);

        List<Integer> res = getAllElements(root1, root2);
        System.out.println(res);
    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        inOrderV2(root1, arrayList1);
        inOrderV2(root2, arrayList2);

        int i = 0;
        int j = 0;
        List<Integer> finalArr = new ArrayList<>();

        while (i < arrayList1.size() && j < arrayList2.size()) {
            if (arrayList1.get(i) <= arrayList2.get(j)) {
                finalArr.add(arrayList1.get(i));
                i++;
            } else {
                finalArr.add(arrayList2.get(j));
                j++;
            }
        }

        while (i < arrayList1.size()) {
            finalArr.add(arrayList1.get(i));
            i++;
        }

        while (j < arrayList2.size()) {
            finalArr.add(arrayList2.get(j));
            j++;
        }

        return finalArr;
    }

    private static void inOrderV2(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) {
            return;
        }
        inOrderV2(root.left, arrayList);
        arrayList.add(root.val);
        inOrderV2(root.right, arrayList);
    }

}
