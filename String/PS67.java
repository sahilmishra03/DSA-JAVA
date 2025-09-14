package String;

import java.util.Arrays;
import java.util.HashSet;

public class PS67 {
    public static void main(String[] args) {
        String[] wordlist = { "KiTe", "kite", "hare", "Hare" };
        String[] queries = { "kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto" };

        System.out.println(Arrays.toString(spellchecker(wordlist, queries)));
    }

    public static String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');

        String[] res = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < wordlist.length; j++) {
                if (queries[i].equals(wordlist[j])) {
                    res[i] = queries[i];
                    break;
                }
            }

            if (res[i] == null) {
                for (int j = 0; j < wordlist.length; j++) {
                    if (queries[i].toLowerCase().equals(wordlist[j].toLowerCase())) {
                        res[i] = wordlist[j];
                        break;
                    }
                }
            }

            if (res[i] == null) {
                for (int j = 0; j < wordlist.length; j++) {
                    String string1 = queries[i].toLowerCase();
                    String string2 = wordlist[j].toLowerCase();

                    if (string1.length() != string2.length())
                        continue;

                    boolean match = true;
                    for (int k = 0; k < string1.length(); k++) {
                        char c1 = string1.charAt(k);
                        char c2 = string2.charAt(k);

                        if (c1 != c2) {
                            if (!(vowelSet.contains(c1) && vowelSet.contains(c2))) {
                                match = false;
                                break;
                            }
                        }
                    }

                    if (match) {
                        res[i] = wordlist[j];
                        break;
                    }
                }
            }

            if (res[i] == null) {
                res[i] = "";
            }
        }

        return res;
    }
}
