package Array;

public class PS111 {
    public static void main(String[] args) {
        int a =12;
        int b =6;

        int helper =0;
        if (a<b) {
            helper=a;
        }else{
            helper=b;
        }
        
        int output =0;
        for (int i = 1; i <= helper; i++) {
            if (a%i==0 && b%i==0) {
                output++;
            }
        }

        System.out.println(output);
    }
}
