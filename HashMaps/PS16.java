package HashMaps;
public class PS16 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6};
        int target = 5;
        int start = 2;
        System.out.println(getMinDistance(nums, target, start));
    }

    public static int getMinDistance(int[] nums, int target, int start) {
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int distance = Math.abs(i - start);
                minDistance = Math.min(minDistance, distance);
            }
        }
        
        return minDistance;
    }
}
