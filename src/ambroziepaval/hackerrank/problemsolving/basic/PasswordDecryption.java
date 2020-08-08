package ambroziepaval.hackerrank.problemsolving.basic;

public class PasswordDecryption {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String decryptPassword(String s) {
        // Write your code here

        StringBuilder result = new StringBuilder();

        int loopEnd = 0;
        for (int i = s.toCharArray().length - 1; i >= loopEnd; i--) {
            char ch = s.charAt(i);

            if ('*' == ch) {
                //step 2
                result.append(s.charAt(i - 2));
                result.append(s.charAt(i - 1));
                i -= 2;
            } else if ('0' == ch) {
                //step 3
                result.append(s.charAt(loopEnd));
                loopEnd++;
            } else {
                result.append(ch);
            }

        }

        return result.reverse().toString();

    }

    public static void main(String[] args) {

        // result = "aP1pL5e"
        System.out.println(PasswordDecryption.decryptPassword("51Pa*0Lp*0e"));
        // result = poTaTO
        System.out.println(PasswordDecryption.decryptPassword("pTo*Ta*O"));
    }

}
