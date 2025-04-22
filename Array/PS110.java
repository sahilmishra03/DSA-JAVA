package Array;

public class PS110 {
    public static void main(String[] args) {
        int num = 1800;
        System.out.println(isSameAfterReversals(num));
    }

    public static boolean isSameAfterReversals(int num) {
        String s1 = String.valueOf(num);
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            stringBuilder1.append(s1.charAt(i));
        }
        stringBuilder1.reverse();
        String s2 = stringBuilder1.toString();
        int val1 = Integer.parseInt(s2);
        String s3 = String.valueOf(val1);
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < s3.length(); i++) {
            stringBuilder2.append(s3.charAt(i));
        }
        stringBuilder2.reverse();
        String s4 = stringBuilder2.toString();
        int val2 = Integer.parseInt(s4);

        if (num == val2) {
            return true;
        }

        return false;
    }
}