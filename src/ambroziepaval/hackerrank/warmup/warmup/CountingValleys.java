package ambroziepaval.hackerrank.warmup.warmup;

public class CountingValleys {

    static int countingValleys(int n, String s) {

        int valleyCount = 0;

        boolean belowZero = false;
        int altitude = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'D') {
                altitude--;
                belowZero = altitude < 0;
            } else {
                altitude++;
                if (altitude == 0 && belowZero) {
                    valleyCount++;
                }
            }
        }

        return valleyCount;
    }

    public static void main(String[] args) {

        int n = 8;
//        String s = "DDUUUUDD";
        String s = "UDDDUDUU";

        System.out.println(CountingValleys.countingValleys(n, s));
    }
}
