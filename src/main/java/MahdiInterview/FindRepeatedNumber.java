package MahdiInterview;

import java.util.Arrays;

public class FindRepeatedNumber {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 3, 6, 4, 5, 3, 4, 2};
        System.out.println(findRepeated(arr));

    }

    public static int findRepeated(int[] arr) {

        int repeatnumber = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ++k;
                }

            }
                if (k >= 3) {
                    repeatnumber = arr[i];
                }

        }
        return repeatnumber;
    }

}


//    Find the integer number that repeated 3 times in this integer Array:
//        Int[] arr = {2,3,5,3,6,4,5,3,4,2}; output should be 3