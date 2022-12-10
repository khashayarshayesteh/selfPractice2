package Codewars;

public class SumOfDigits {


   public static int finalSum(int n) {
        int result = 0;

        while (n > 0 || result > 9) {
         //   if (n == 0) {n = o ; n = result; result = 0;}

            result = n % 10+ finalSum(n / 10);
                    }
        return result;
    }

    // Driver code
    public static void main(String argc[]) {
        int n = 16;
        System.out.println(finalSum(n));
    }
}





