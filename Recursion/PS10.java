package Recursion;

import java.util.ArrayList;

public class PS10 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 5 };
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (index == arr.length) {
            return arrayList;
        }

        if (target == arr[index]) {
            arrayList.add(index);
        }
        ArrayList<Integer> list = findAllIndex2(arr, target, index + 1);

        arrayList.addAll(list);

        return arrayList;
    }
}
