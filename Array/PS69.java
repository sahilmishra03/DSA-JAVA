package Array;

import java.util.List;
import java.util.ArrayList;

public class PS69 {
    public static void main(String[] args) {
        int[] height = { 1, 2, 3, 4, 5 };
        int threshold = 2;
        System.out.println(stableMountains(height, threshold));
    }

    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> List = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            int value = height[i - 1];
            if (value > threshold) {
                List.add(i);
            }
        }
        return List;
    }
}
