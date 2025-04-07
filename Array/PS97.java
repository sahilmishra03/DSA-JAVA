package Array;

import java.util.Arrays;

public class PS97 {
    public static void main(String[] args) {
        int[] heights = { 5, 1, 2, 3, 4 };
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] helper = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int res = 0;
        for (int i = 0; i < helper.length; i++) {
            if (helper[i] != heights[i]) {
                res++;
            }
        }
        return res;
    }
}
