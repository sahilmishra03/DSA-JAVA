package Array;

public class PS72 {
    public static void main(String[] args) {
        String s = "2080-02-29";
        System.out.println(convertDateToBinary(s));
    }

    public static String convertDateToBinary(String date) {
        String[] strings = date.split("-");
        String[] res = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            int value = Integer.parseInt(strings[i]);
            res[i] = Integer.toBinaryString(value);
        }

        return String.join("-", res);
    }
}
