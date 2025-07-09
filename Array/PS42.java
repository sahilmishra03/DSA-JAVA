package Array;

import java.util.List;
import java.util.ArrayList;

public class PS42 {
    public static void main(String[] args) {
        int[] candies = { 12, 1, 12 };
        int extraCandies = 10;
        List<Boolean> rBooleans = kidsWithCandies(candies, extraCandies);
        System.out.println(rBooleans);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resuBooleans = new ArrayList<>();
        int maxCandies = 0;

        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                resuBooleans.add(true);
            } else {
                resuBooleans.add(false);
            }
        }

        return resuBooleans;
    }
}
