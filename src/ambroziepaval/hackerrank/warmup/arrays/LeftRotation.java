package ambroziepaval.hackerrank.warmup.arrays;

import java.util.Arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {


            result[i] = a[(i + d) % a.length];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int d = 6;

        System.out.println(Arrays.toString(LeftRotation.rotLeft(a, d)));
    }
}
