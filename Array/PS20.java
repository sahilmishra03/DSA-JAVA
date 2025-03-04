package Array;

public class PS20 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        int result = countTriplet(arr);
        System.out.println(result);
    }

    public static int countTriplet(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                for (int k = 0; k < arr.length; k++) {
                    if (sum != arr[j] && sum != arr[i] && sum == arr[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
