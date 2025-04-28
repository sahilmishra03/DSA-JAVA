package Array;

public class PS115 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        int sum = 0, product = 1;
        for (int i = 0; i < s.length(); i++) {
            String helperString = String.valueOf(s.charAt(i));
            int number = Integer.parseInt(helperString);
            sum += number;
            product *= number;
        }

        return product - sum;
    }
}
