package String;

public class PS27 {
    public static void main(String[] args) {
        String string = "1234";
        System.out.println(isBalanced(string));
    }

    public static boolean isBalanced(String num) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i%2==0) {
                char c = num.charAt(i);
                String string=String.valueOf(c);
                int digit=Integer.parseInt(string);
                sumEven+=digit;
            }else{
                char c = num.charAt(i);
                String string=String.valueOf(c);
                int digit=Integer.parseInt(string);
                sumOdd+=digit;
            }
        }
        if (sumEven==sumOdd) {
            return true;
        }
        return false;
    }
}