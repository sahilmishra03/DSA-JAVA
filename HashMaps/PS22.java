package HashMaps;

import java.util.Arrays;
import java.util.HashSet;

public class PS22 {
    public static void main(String[] args) {
        int[][] grid = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] res = new int[2];
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (hashSet.contains(grid[i][j])) {
                    res[index] = grid[i][j];
                    index++;
                } else {
                    hashSet.add(grid[i][j]);
                }
            }
        }
        for (int i = 1; i <= grid.length * grid[0].length; i++) {
            if (!hashSet.contains(i)) {
                res[index] = i;
                index++;
            }
        }
        return res;
    }
}
