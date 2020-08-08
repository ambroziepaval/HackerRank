package ambroziepaval.hackerrank.java.intermediate;

import java.util.Arrays;
import java.util.List;

public class TaskOfPairing {

    public static long taskOfPairing(List<Long> freq) {
        // Write your code here

        long pairCounts = 0;

        boolean carryover = false;
        for (int i = 0; i < freq.size(); i++) {

            if (carryover && freq.get(i) > 0) {
                freq.set(i, freq.get(i) - 1);
                pairCounts += 1;
            }
            pairCounts += freq.get(i) / 2;
            carryover = freq.get(i) % 2 == 1;
        }

        return pairCounts;
    }

    public static void main(String[] args) {

        // result = 7
        List<Long> freq = Arrays.asList(3L, 5L, 4L, 3L);
        System.out.println(TaskOfPairing.taskOfPairing(freq));
    }
}
