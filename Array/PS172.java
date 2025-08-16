package Array;

public class PS172 {
    public static void main(String[] args) {
        String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
        System.out.println(countSeniors(details));
    }

    public static int countSeniors(String[] details) {
        int res = 0;
        for (int i = 0; i < details.length; i++) {
            String value = details[i];
            StringBuilder sb = new StringBuilder();
            sb.append(value.charAt(11));
            sb.append(value.charAt(12));

            if (Integer.valueOf(sb.toString()) > 60) {
                res++;
            }
        }

        return res;
    }
}
