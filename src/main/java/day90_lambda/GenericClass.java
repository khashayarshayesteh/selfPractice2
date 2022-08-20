package day90_lambda;

import day89_javaAdvance_genericsAdnEnums.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericClass {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6};
        Double[] decimals = {1.5,2.5,3.5,4.5,5.5,6.5};
        String[] names = {"Java","Selenium","SQL","API","Wooden Spoon"};
        Shape[] shapes = {null,null};

        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(15,20,34,50));
        ArrayList<Double> scores1 = new ArrayList<>(Arrays.asList(15.3,12.3,45.5));

        GenericTest.printEach(numbers);
        GenericTest.printEach(names);
        GenericTest.printEach(scores);
        GenericTest.printEach(scores1);
        GenericTestUnStatic<Integer> obj = new GenericTestUnStatic<>();
        obj.printEach(numbers);
        System.out.println("--------------------------------");
       // List<Integer>



    }
}
