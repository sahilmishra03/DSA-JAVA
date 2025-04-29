package Array;

public class PS119 {
    public static void main(String[] args) {
        int nums[] = { 1, 0, 0, 0, 1, 0, 0, 1 };
        int k = 2;
        System.out.println(kLengthApart(nums, k));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]==1) {
                    count++;
                    if (nums[i]==nums[i] && count>=k) {
                        result=true;
                    }else{
                        result=false;
                    }
                }
            }
        }
        return result;
    }
}
