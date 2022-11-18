package day90_lambda;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class aaaa {
    public static void main(String[] args) {


        String str = "34gkjkh4jkjf8sfhk44nfk55";
        str = str.toLowerCase();
        str = str.replaceAll("[a-z]", "@");
        String[] str1 = str.split("@");




        List<String> str2 = stream(str1).filter(p -> p != "").collect(Collectors.toList());
        //  System.out.println((Integer.parseInt(str2.stream().max(Integer::compare)).get));


        System.out.println(str2);
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < str2.size(); i++) {
            if (Integer.parseInt(str2.get(i)) > Max) {
                Max = Integer.parseInt(str2.get(i));

            }
        }
        System.out.println(Max);
    }


}

