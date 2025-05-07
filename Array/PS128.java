package Array;

public class PS128 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int findNextGreatestLetter = target;
        for (int i = 0; i < letters.length; i++) {
            int check = letters[i];
            if (check>findNextGreatestLetter) {
                return letters[i];
            }
        }

        return letters[0];
    }
}
