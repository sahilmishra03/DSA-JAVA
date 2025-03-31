package Recursion;

import java.util.ArrayList;

public class PS09 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 5 };
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(sIntegers(arr, 4, 0, arrayList));
    }

    static ArrayList<Integer> sIntegers(int[] arr, int target, int index, ArrayList<Integer> arrayList) {
        if (index == arr.length) {
            return arrayList;
        }

        if (target == arr[index]) {
            arrayList.add(index);
        }
        return sIntegers(arr, target, index + 1, arrayList);
    }
}
