package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS64 {
    public static void main(String[] args) {
        int[] nums = { 1, 9, 8, 3, 10, 5 };
        System.out.println(minimumAverage(nums));
    }

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : nums) {
            arrayList.add(integer);
        }
        ArrayList<Double> avg = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int num1 = arrayList.get(0);
            int num2 = arrayList.get(arrayList.size() - 1);
            arrayList.remove(0);
            arrayList.remove(arrayList.size() - 1);
            double average = (num1 + num2) / 2.0;
            avg.add(average);
            i = 0;
        }
        double min = Double.MAX_VALUE;
        for (int i = 0; i < avg.size(); i++) {
            if (min > avg.get(i)) {
                min = avg.get(i);
            }
        }
        return min;
    }
}
