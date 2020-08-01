package ambroziepaval.hackerrank.warmup.arrays;

public class NewYearChaos {

    static void minimumBribes(int[] q) {

        boolean chaotic = false;
        int bribeCount = 0;

        for (int i = 0; i < q.length; i++) {

            if (q[i] - (i + 1) > 2) {
                chaotic = true;
                break;
            }

            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j]>q[i]){
                    bribeCount++;
                }
            }
        }

        if(chaotic){
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribeCount);
        }
    }

    public static void main(String[] args) {

        int[] q1 = {2, 1, 5, 3, 4};
        int[] q2 = {2, 5, 1, 3, 4};
        int[] q3 = {2, 4, 1, 3, 5};

        NewYearChaos.minimumBribes(q1);
        NewYearChaos.minimumBribes(q2);
        NewYearChaos.minimumBribes(q3);
    }
}
