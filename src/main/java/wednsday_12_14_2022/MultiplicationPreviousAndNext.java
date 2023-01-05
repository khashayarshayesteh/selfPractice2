package wednsday_12_14_2022;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationPreviousAndNext {

    public static void main(String[] args) {

    int [] numbers = {2,3};
    int [] newNumbers = new int[numbers.length] ;

        for (int i = 0; i <numbers.length ; i++) {
            if(i == 0){newNumbers[0] = numbers[i] * numbers[(i+1)];}
            else if(i == numbers.length-1 ){newNumbers[numbers.length-1 ] = numbers[numbers.length-1 ] * numbers[(numbers.length-2)];}
            else newNumbers[i] = numbers[i-1] * numbers[i+1];
                    }
        System.out.println(Arrays.toString(newNumbers));




        }
    }