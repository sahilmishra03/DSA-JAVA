package Stack;

public class PS09 {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int water = 0;
        // BFA

        // for (int i = 1; i < height.length - 2; i++) {
        // int curr = height[i];

        // int leftMax = curr;
        // int rightMax = curr;

        // for (int j = i - 1; j >= 0; j--) {
        // leftMax = Math.max(leftMax, height[j]);
        // }

        // for (int j = i + 1; j < height.length; j++) {
        // rightMax = Math.max(rightMax, height[j]);
        // }

        // water += Math.min(leftMax, rightMax) - curr;
        // }

        // BFA+Optimise

        // for (int i = 1; i < height.length - 2; i++) {
        // int curr = height[i];

        // int leftMax = curr;
        // int rightMax = curr;

        // for (int j = i - 1; j >= 0; j--) {
        // leftMax = Math.max(leftMax, height[j]);
        // }

        // for (int j = i + 1; j < height.length; j++) {
        // rightMax = Math.max(rightMax, height[j]);
        // if (rightMax >= leftMax) {
        // break;
        // }
        // }

        // water += Math.min(leftMax, rightMax) - curr;
        // }

        // BFA+ Optimise + Level 2

        // int leftMaxs[] = new int[height.length];
        // leftMaxs[0] = height[0];
        // int rightMaxs[] = new int[height.length];
        // rightMaxs[rightMaxs.length - 1] = height[height.length - 1];

        // for (int i = 1; i < leftMaxs.length - 1; i++) {
        // leftMaxs[i] = Math.max(height[i], leftMaxs[i - 1]);
        // }

        // for (int i = rightMaxs.length - 2; i >= 0; i--) {
        // rightMaxs[i] = Math.max(height[i], rightMaxs[i + 1]);
        // }

        // for (int i = 1; i < height.length - 1; i++) {
        // water += Math.min(leftMaxs[i], rightMaxs[i]) - height[i];
        // }

        // BFA+ Optimise + Level 3
        int left = 1, right = height.length - 2;
        int leftMax = height[0], rightMax = height[height.length - 1];

        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (rightMax < leftMax) {
                water += rightMax - height[right];
                right--;
            } else {
                water += leftMax - height[left];
                left++;
            }
        }

        return water;
    }
}
