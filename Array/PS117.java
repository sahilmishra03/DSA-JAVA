package Array;

public class PS117 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        String s = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            String h = String.valueOf(s.charAt(i));
            int number = Integer.parseInt(h);
            sum += number;
        }

        if (x % sum == 0) {
            return sum;
        }

        return -1;
    }
}
