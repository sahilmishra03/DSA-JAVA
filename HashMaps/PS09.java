package HashMaps;

import java.util.HashSet;

public class PS09 {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        HashSet<Integer> unionIntegers = new HashSet<>();
        HashSet<Integer> intersectionIntegers = new HashSet<>();
        //Union
        for (int i = 0; i < arr1.length; i++) {
            unionIntegers.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            unionIntegers.add(arr2[i]);
        }
        System.out.println(unionIntegers.size());
        //Intersection
        for (int i = 0; i < arr1.length; i++) {
            intersectionIntegers.add(arr1[i]);
        }
        int count=0;
        for (int i = 0; i < arr2.length; i++) {
            if (intersectionIntegers.contains(arr2[i])) {
                count++;
                intersectionIntegers.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}
