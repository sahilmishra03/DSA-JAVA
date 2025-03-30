package Array;

public class PS88 {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;

                for (int k = 0; k < nums.length; k++) {
                    for (int l = 0; l < nums.length; l++) {
                        if (k == l || k == i || k == j || l == i || l == j) continue;

                        int productDifference = (nums[i] * nums[j]) - (nums[k] * nums[l]);

                        if (productDifference > res) {
                            res = productDifference;
                        }
                    }
                }
            }
        }

        return res;
    }
}
