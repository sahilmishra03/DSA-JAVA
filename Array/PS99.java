package Array;

public class PS99 {
    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
    }

    public static int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += ('z' - s.charAt(i) + 1) * (i + 1);
        }
        return sum;
    }
}