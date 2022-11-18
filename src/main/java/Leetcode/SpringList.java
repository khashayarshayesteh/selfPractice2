package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpringList {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 20, 86, 300, 200, 20, 500, 40, 86));
        System.out.println(remove3(list1));
    }

    public static List<Integer> remove3(List<Integer> list1) {

        list1 = list1.stream()
                .filter(p -> p < 100)
                .distinct()
                .toList();
        return list1;
    }
}


