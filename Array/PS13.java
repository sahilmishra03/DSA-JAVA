package Array;

public class PS13 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (arr[i] == arr[j])
                    count++;
                else
                    count = 0;
            }
        }
        System.out.println(count);
    }
}
