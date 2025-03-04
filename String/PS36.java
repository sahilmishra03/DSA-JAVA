package String;

public class PS36 {
    public static void main(String[] args) {
        String num1String = "11";
        String num2String = "123";
        System.out.println(addStrings(num1String, num2String));
    }

    public static String addStrings(String num1, String num2) {
        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);
        int sum = num1Int + num2Int;
        return Integer.toString(sum);
    }
}
