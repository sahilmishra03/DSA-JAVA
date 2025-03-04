package Array;

public class PS06 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 0};
        int c = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                c++;
            }
        }
        System.out.println(c);
    }
}
