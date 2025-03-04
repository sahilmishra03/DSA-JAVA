package Array;

public class PS79 {
    public static void main(String[] args) {
        int[] nums = { 12, 12, 30, 24, 24 };
        System.out.println(countCompleteDayPairs(nums));
    }

    public static int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
