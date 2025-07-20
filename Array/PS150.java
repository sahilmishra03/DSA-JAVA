package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PS150 {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        int[][] result = merge(intervals);

        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<List<Integer>> resHelper = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int index = 1; index < intervals.length; index++) {
            if (end >= intervals[index][0]) {
                end = Math.max(end, intervals[index][1]);
            } else {

                List<Integer> addListNormalIntervals = new ArrayList<>();
                addListNormalIntervals.add(start);
                addListNormalIntervals.add(end);
                resHelper.add(addListNormalIntervals);

                start = intervals[index][0];
                end = intervals[index][1];
            }
        }

        List<Integer> addListNormalIntervals = new ArrayList<>();
        addListNormalIntervals.add(start);
        addListNormalIntervals.add(end);
        resHelper.add(addListNormalIntervals);

        int[][] output = new int[resHelper.size()][2];
        for (int i = 0; i < output.length; i++) {
            List<Integer> getList = resHelper.get(i);
            output[i][0] = getList.get(0);
            output[i][1] = getList.get(1);
        }

        return output;
    }
}
