//Divisor

package Math;

import java.util.ArrayList;

public class Concept08 {
    public static void main(String[] args) {
        int value = 24;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {   
                arrayList.add(i);
            }
        }

        System.out.println(arrayList);
    }
}
