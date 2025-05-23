package Array;

public class PS137 {
    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        int cnt = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}