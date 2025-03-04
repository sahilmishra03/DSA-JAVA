package Array;

public class PS02 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 10;
        int res = countPair(arr, k);
        System.out.println(res);
    }
    public static int countPair(int arr[], int k) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == k) {
                    c++;
                }
            }
        }
        return c;
    }
}
