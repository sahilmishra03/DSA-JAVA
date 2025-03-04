package String;

public class PS35 {
    public static void main(String[] args) {
        String str = "Hello, my name is John";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        String[] strings = str.split(" ");
        System.out.println(strings.length);
    }
}
