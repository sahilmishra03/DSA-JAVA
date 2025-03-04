package String;

public class PS30 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int asciiValue = c;
            arr[i]=asciiValue;
        }
        int sum=0;
        for (int i = 0; i < arr.length-1; i++) {
            int a = arr[i];
            int b = arr[i+1];
            int sub = Math.abs(a-b);
            sum+=sub;
        }
        return sum;
    }
}
