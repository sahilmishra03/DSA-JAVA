package Array;

import java.util.ArrayList;
import java.util.List;

public class PS82 {
    public static void main(String[] args) {
        int[] mountain = { 1, 4, 3, 8, 5 };
        System.out.println(findPeaks(mountain));
    }

    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < mountain.length; i++) {
            if (i > 0 && i < mountain.length - 1) {
                if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                    list.add(i);
                }
            }
        }
        return list;
    }
}