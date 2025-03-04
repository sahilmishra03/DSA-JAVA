package Array;

import java.util.Arrays;

public class PS17 {
    public static void main(String[] args) {
        int num1[] = {4, 1, 2};
        int num2[] = {1, 3, 4, 2};
        int result[] = nextGreaterElement(num1, num2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int indexofres = 0;

        for (int i = 0; i < nums1.length; i++) {
            int nextGreater = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            nextGreater = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            res[indexofres++] = nextGreater;
        }
        return res;
    }
}
