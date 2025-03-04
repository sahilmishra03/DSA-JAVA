package String;
import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String s2 = "I love Sahil";
        String[] arr =s2.split(" ");
        System.out.println(Arrays.toString(arr));//To store a string in the array
        System.out.println(s2.substring(6));
        System.out.println(s2.charAt(2));
        System.out.println(s2.length());
        System.out.println(s2.concat(" Mishra"));
        for (int i=0;i<s2.length();i++){
            System.out.println(s2.charAt(i));
        }
    }
}
