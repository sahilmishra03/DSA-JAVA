package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS32 {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res.add(nums1[i]);
                    break;
                }
            }
        }
        Integer[] resA = res.toArray(new Integer[res.size()]);
        int index = 0;
        for (int num : resA) {
            resA[index++] = num;
        }
        System.out.println(Arrays.toString(resA));
    }
}
