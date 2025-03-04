package String;

public class PS28 {
    public static void main(String[] args) {
        String addressString = "1.1.1.1";
        System.out.println(defangIPaddr(addressString));
    }

    public static String defangIPaddr(String address) {
        String reString = new String();
        char dotString = '.';
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == dotString) {
                reString += "[.]";
            } else {
                String string = String.valueOf(c);
                reString += string;
            }
        }
        return reString;
    }
}