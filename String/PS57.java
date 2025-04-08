package String;

public class PS57 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
        System.out.println(findPermutationDifference(s, t));
    }

    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                char c2 = t.charAt(j);
                if (c1 == c2) {
                    sum += Math.abs(i - j);
                    break;
                }
            }
        }
        return sum;
    }
}
