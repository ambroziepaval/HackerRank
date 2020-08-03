package ambroziepaval.hackerrank.warmup.dictionariesandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> magazineMap = new HashMap<>();
        for (String magazineWord : magazine) {
            magazineMap.merge(magazineWord, 1, Integer::sum);
        }

        boolean failed = false;
        for (String word : note) {
            if (magazineMap.getOrDefault(word, 0) == 0) {
                System.out.println("No");
                failed = true;
                break;
            }
            magazineMap.put(word, magazineMap.get(word) - 1);
        }
        if (!failed) {
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {

        String[] magazine0 = {"give", "me", "one", "grand", "today", "night"};
        String[] note0 = {"give", "one", "grand", "today"};

        String[] magazine1 = {"two", "times", "three", "is", "not", "four"};
        String[] note1 = {"two", "times", "two", "is", "four"};

        String[] magazine2 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note2 = {"ive", "got", "some", "coconuts"};

        RansomNote.checkMagazine(magazine0, note0);
        RansomNote.checkMagazine(magazine1, note1);
        RansomNote.checkMagazine(magazine2, note2);
    }
}
