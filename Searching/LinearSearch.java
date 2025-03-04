package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 5, 3, 9};
        int value = 9;
        System.out.println(linearSearch(nums, value));
    }

    public static int linearSearch(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
