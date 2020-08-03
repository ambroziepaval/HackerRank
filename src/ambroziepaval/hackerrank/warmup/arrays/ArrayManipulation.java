package ambroziepaval.hackerrank.warmup.arrays;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {

        long[] array = new long[n + 1];

        for (int[] operation : queries) {

            array[operation[0]] += operation[2];

            if (operation[1] + 1 <= n) {
                array[operation[1] + 1] -= operation[2];
            }
        }

        long max = 0, current = 0;
        for (long element : array) {
            current += element;
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {

//        int n = 5;
//        int[][] queries = {
//                {1, 2, 100},
//                {2, 5, 100},
//                {3, 4, 100}};

        int n = 10;
        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}};


        System.out.println(ArrayManipulation.arrayManipulation(n, queries));
    }
}
