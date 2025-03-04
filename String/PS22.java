package String;

public class PS22 {
    public static void main(String[] args) {
        String nuString = "4206";
        System.out.println(largestOddNumber(nuString));
    }

    public static String largestOddNumber(String num) {
            String reString = new String();
            int number = Integer.parseInt(num);
            if (number % 2 == 0) {
                for (int i = 0; i < num.length(); i++) {
                    char c = num.charAt(i);
                    String string = String.valueOf(c);
                    int numberIs = Integer.parseInt(string);
                    if (numberIs % 2 != 0) {
                        reString+=string;
                    }
                }
            }else{
                return num;
            }
            return reString;
    }
}
