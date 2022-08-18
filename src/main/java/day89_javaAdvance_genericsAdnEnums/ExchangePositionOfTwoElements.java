package day89_javaAdvance_genericsAdnEnums;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExchangePositionOfTwoElements {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        a.addAll(Arrays.asList(1,2,3,4));
        Collections.swap(a,0,2);
        System.out.println(a);



    }








}

/*
Write a generic method to exchange the positions of two different elements in
array.
Sample output:
Integer[] a = {1,2,3,4};
swap(a,0,2);
System.out.println(Arrays.toString(a)); //[3,2,1,4]


 */
