package String;

public class PS20 {
    public static void main(String[] args) {
        String[] opStrings = { "--X", "X++", "X++" };
        System.out.println(finalValueAfterOperations(opStrings));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                result--;
            } else if (operations[i].equals("++X") || operations[i].equals("X++")) {
                result++;
            }
        }
        return result;
    }
}