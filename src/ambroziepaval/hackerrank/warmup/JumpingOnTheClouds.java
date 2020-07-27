package ambroziepaval.hackerrank.warmup;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        int steps = 0;

        int position = 0;
        while (position < c.length - 1) {

            if (position + 2 < c.length && c[position + 2] == 0) {
                position += 2;
            } else {
                position += 1;
            }

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {

//        int[] c = {0, 0, 0, 0, 1, 0};
//        int[] c = {0, 1, 0, 0, 0, 1, 0};
        int[] c = {0, 0, 1, 0, 0, 1, 0};

        System.out.println(JumpingOnTheClouds.jumpingOnClouds(c));
    }
}
