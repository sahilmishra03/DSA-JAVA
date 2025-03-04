package String;

public class PS26 {
    public static void main(String[] args) {
        String[] strings = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
        System.out.println(countSeniors(strings));
    }

    public static int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            //Optimal Approach
            String string = details[i].substring(11, 13);
            int ageStringInt = Integer.parseInt(string);
            if (ageStringInt > 60) {
                count++;
            }
        }
        return count;
    }
}
