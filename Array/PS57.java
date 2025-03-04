package Array;

public class PS57 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 11 };
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        boolean checkIfExistValue = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] != arr[j] * 2) {
                    checkIfExistValue = true;
                }
            }
        }
        return checkIfExistValue;
    }
}