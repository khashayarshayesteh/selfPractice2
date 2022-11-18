package day90_lambda;

public class MaximumNumber2 {

    public static void main(String[] args) {
        String str = "45fdgbg5fdgb78456fdgb56dfgtbed87bgregbe89fge865s";
        System.out.println(extractMaximum(str));

    }

    static int extractMaximum(String str) {
        int num = 0;
        int max = Integer.MIN_VALUE;

        // Start traversing the given string
        for (int i = 0; i < str.length(); i++) {


            if (Character.isDigit(str.charAt(i))) {
                num = num * 10 + (str.charAt(i) - '0');

                // Update maximum value
            } else {
                max = Math.max(max, num);

                // Reset the number
                num = 0;
            }
        }

        // Return maximum value
        return max;
    }
}
