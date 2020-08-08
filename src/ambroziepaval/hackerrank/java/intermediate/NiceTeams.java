package ambroziepaval.hackerrank.java.intermediate;

import java.util.Arrays;
import java.util.List;

public class NiceTeams {

    public static int maxPairs(List<Integer> skillLevel, int minDiff) {

        int pairCount = 0;

        skillLevel.sort(Integer::compareTo);

        int[] usage = new int[skillLevel.size()];

        for (int i = skillLevel.size() - 1; i > 1; i--) {
            if (usage[i] == 1) {
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {

                if (usage[j] == 0 && skillLevel.get(i) - skillLevel.get(j) >= minDiff) {
                    pairCount++;
                    usage[j] = 1;
                    break;
                }
            }
        }

        return pairCount;
    }

    public static void main(String[] args) {

//        List<Integer> skillLevel = Arrays.asList(1, 1, 1, 1);
//        int minDiff = 1;

//        List<Integer> skillLevel = Arrays.asList(3, 4, 5, 2, 1, 1);
//        int minDiff = 3;

        List<Integer> skillLevel = Arrays.asList(709552565, 473251358, 803612259, 579542802, 183012194, 689345248, 151290765, 123232501, 994391793, 25107191, 862726097);
        int minDiff = 440987423;

        System.out.println(NiceTeams.maxPairs(skillLevel, minDiff));
    }
}
