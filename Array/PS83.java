package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS83 {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < stones.length; i++) {
            arrayList.add(stones[i]);
        }

        while (arrayList.size() > 1) {
            int num1 = arrayList.remove(arrayList.size() - 1);
            int num2 = arrayList.remove(arrayList.size() - 1);

            if (num1 != num2) {
                arrayList.add(Math.abs(num1 - num2));
                arrayList.sort(null);
            }
        }

        return arrayList.isEmpty() ? 0 : arrayList.get(0);
    }
}
