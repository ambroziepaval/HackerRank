package ambroziepaval.hackerrank.warmup.dictionariesandhashmaps;

import java.util.HashSet;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {

        HashSet<Character> characterSet = new HashSet<>();
        for (char c : s1.toCharArray()) {
            characterSet.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (characterSet.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {

        String s1_1 = "hello";
        String s2_1 = "world";

        String s1_2 = "hi";
        String s2_2 = "world";

        System.out.println(TwoStrings.twoStrings(s1_1, s2_1));
        System.out.println(TwoStrings.twoStrings(s1_2, s2_2));
    }
}
