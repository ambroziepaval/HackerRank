package ambroziepaval.hackerrank.warmup;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        int[] pairs = new int[101];

        int sockCount = 0;
        for (int sock : ar) {
            pairs[sock]++;
            if (pairs[sock] == 2) {
                sockCount++;
                pairs[sock] = 0;
            }
        }

        return sockCount;
    }

    public static void main(String[] args) {

        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(SockMerchant.sockMerchant(n, ar));
    }
}
