package Array;

public class PS155 {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 1, 3, 5 };
        System.out.println(inversionCount(nums));
    }

    public static int inversionCount(int arr[]) {
        // Code Here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i < j && arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;

        
    }
}