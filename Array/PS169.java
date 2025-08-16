package Array;

public class PS169 {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        int[] res = replaceElements(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        res[n - 1] = -1;
        int max = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            res[i] = max;
            max = Math.max(max, arr[i]);
        }

        return res;
    }
}
