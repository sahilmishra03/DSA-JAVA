package Array;

public class PS03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        int k = 4;
        countPair(arr, k);
    }
    public static void countPair(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == k) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
