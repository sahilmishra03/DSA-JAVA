package Array;

public class PS19 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        rearrange(arr);
        printArray(arr);
    }
    public static void rearrange(int arr[]) {
        int[] helperArray = new int[arr.length];
        int index = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (index < arr.length) {
                helperArray[index] = arr[right];
                right--;
                index++;
            }
            if (index < arr.length) {
                helperArray[index] = arr[left];
                left++;
                index++;
            }
        }
        for (int i = 0; i < helperArray.length; i++) {
            arr[i] = helperArray[i];
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
