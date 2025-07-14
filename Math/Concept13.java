package Math;

public class Concept13 {
    public static void main(String[] args) {
        int num = 5;
        int res = 1;
        while (num >= 1) {
            res *= num;
            num--;
        }

        System.out.println(res);
    }
}
