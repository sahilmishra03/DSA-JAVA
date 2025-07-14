package Math;

public class Concept14 {
    public static void main(String[] args) {
        long num = 456700442000l;
        boolean flag = true;
        int cnt = 0;
        while (flag) {
            long rem = num % 10;
            if (rem == 0) {
                cnt++;
            } else {
                flag = false;
            }

            num /= 10;
        }

        System.out.println(cnt);
    }
}
