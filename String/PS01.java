package String;

public class PS01 {
    public static void main(String[] args) {
        //Reverse the String
        String s1 = "i love you";
        StringBuilder res = new StringBuilder();
        int end = s1.length();
        for (int i =end-1;i>=0;i--){
            if (s1.charAt(i)==' ') {
                res.append(s1.substring(i + 1, end)).append(" ");
                end=i;
            }
        }
        if (end>0){
            res.append(s1.substring(0,end));
        }
        System.out.println(res);
    }
}
