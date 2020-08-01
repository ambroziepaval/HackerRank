package ambroziepaval.hackerrank.warmup.arrays;

public class MinimumSwaps2 {

    static int minimumSwaps(int[] arr) {

        int swapCount = 0;

        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                swapCount++;
            } else {
                i++;
            }
        }

        return swapCount;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 3, 1, 2};
        int[] arr2 = {2, 3, 4, 1, 5};
        int[] arr3 = {1, 3, 5, 2, 4, 6, 7};

        System.out.println(minimumSwaps(arr1));
        System.out.println(minimumSwaps(arr2));
        System.out.println(minimumSwaps(arr3));
    }
}
