package day89_javaAdvance_genericsAdnEnums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodCompile {

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        print(list);
    }

        public static void print (List < ? extends Number > list){
            for (Number n : list)
                System.out.print(n + " ");
            System.out.println();
        }





}
