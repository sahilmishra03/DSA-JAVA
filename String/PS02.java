package String;

import java.util.Arrays;

public class PS02 {
    public static void main(String[] args) {
        String s = "abcdab";
        findDuplicate(s);
    }

    public static void findDuplicate(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            int arrIndex = index - 97;
            arr[arrIndex]++;
            //System.out.println(s.charAt(i)+"ASCII VALUE IS "+arrIndex);
        }
        System.out.println(Arrays.toString(arr));
        for (int i=0;i< arr.length;i++){
            if (arr[i]>1){
                char c = (char) (97+i);
                System.out.println(c);
            }
        }
    }
}
