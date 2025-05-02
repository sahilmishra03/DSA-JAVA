package String;

public class PS62 {
    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k) {
        String helper = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int temp = (int) c;
            int temp_integer = 96;
            if (temp <= 122 && temp >= 97) {
                String addString = String.valueOf(temp - temp_integer);
                helper += addString;
            }
        }
        
        int res = 0;
        int count = 1;
        while (count <= k) {
            res = 0;
            for (int i = 0; i < helper.length(); i++) {
                char c = helper.charAt(i);
                String help = String.valueOf(c);
                int addvalue = Integer.parseInt(help);
                res += addvalue;
            }
            helper = String.valueOf(res);
            count++;
        }

        return res;
    }
}
