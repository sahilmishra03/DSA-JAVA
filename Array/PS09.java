package Array;

public class PS09 {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int res = arr[0], me = arr[0];
        for (int i = 1; i < arr.length; i++) {
            me = Math.max(me + arr[i], arr[i]);
            res = Math.max(me, res);
        }
        System.out.println(res);
    }
}
