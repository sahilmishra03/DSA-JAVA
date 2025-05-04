package Array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class PS124 {
    public static void main(String[] args) {
        int digits[] = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        String helperString = "";
        for (int i = 0; i < digits.length; i++) {
            String addValue = String.valueOf(digits[i]);
            helperString += addValue;
        }
        BigInteger bigInteger = new BigInteger(helperString);
        BigInteger plusInteger = BigInteger.ONE;
        BigInteger result = bigInteger.add(plusInteger);

        int resToAddinArray = result.intValue();

        helperString = String.valueOf(resToAddinArray);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < helperString.length(); i++) {
            int arrAddValue = Integer.parseInt(String.valueOf(helperString.charAt(i)));
            arrayList.add(arrAddValue);
        }
        int res[] = new int[arrayList.size()];
        int idx = 0;
        for (Integer integer : arrayList) {
            res[idx] = integer;
            idx++;
        }
        return res;
    }
}