package Array;

public class Sorting_Array {
    public static void main(String[] args) {
        int[] arr = {-6, 5, -3, 4, -1, 2};

        //Descending Order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        //Ascending Order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}