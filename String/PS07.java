package String;

public class PS07 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        String[] arr = s.split(" ");
        String string = arr[arr.length - 1];
        int count = 0;
        for (@SuppressWarnings("unused") char c : string.toCharArray()) {
            count++;
        }
        System.out.println(count);
    }
}
