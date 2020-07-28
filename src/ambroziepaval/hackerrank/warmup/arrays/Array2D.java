package ambroziepaval.hackerrank.warmup.arrays;

public class Array2D {

    static int hourglassSum(int[][] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {

                int currentHourglass = arr[i][j] +
                        arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] +
                        arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];

                max = Math.max(max, currentHourglass);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println(Array2D.hourglassSum(arr));
    }

}
