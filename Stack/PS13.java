package Stack;

public class PS13 {
    public static void main(String[] args) {
        int heights[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(heights));
    }

    public static int trap(int[] height) {
        int water = 0;
        int leftMaxArr[] = new int[height.length];
        leftMaxArr[0] = height[0];

        for (int i = 1; i < leftMaxArr.length; i++) {
            leftMaxArr[i] = Math.max(leftMaxArr[i - 1], height[i]);
        }

        int rightMaxArr[] = new int[height.length];
        rightMaxArr[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightMaxArr[i] = Math.max(rightMaxArr[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            water += Math.min(leftMaxArr[i], rightMaxArr[i]) - height[i];
        }

        return water;
    }
}
