package Array;
public class PS15 {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] newArray = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int multi = nums[i] * nums[i];
            newArray[index] = multi;
            index++;
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j] < newArray[i]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for (int i = 0;i< newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
