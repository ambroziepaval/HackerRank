package ambroziepaval.hackerrank.warmup.warmup;

public class RepeatedString {

    static long repeatedString(String s, long n) {

        long aCount = 0;

        int position = 0;
        long charCount = 0;

        // looped max 2 times
        while (charCount < n) {

            if (s.charAt(position) == 'a') {
                aCount++;
            }
            position++;
            charCount++;

            if (position == s.length() && charCount < n) {
                long factor = n / position;
                aCount *= factor;
                charCount *= factor;
                position = 0;
            }
        }

        return aCount;
    }

    public static void main(String[] args) {

//        String s = "aba";
//        long n = 10;
        String s = "a";
        long n = 1000000000000L;

        System.out.println(RepeatedString.repeatedString(s, n));
    }
}
