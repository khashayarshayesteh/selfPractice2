package day90_lambda;

import java.util.List;

public class GenericTest {

    public static <T> void printEach(T[] array) {
        for (T each : array) {
            System.out.println(each);

        }
    }

    public static <T> void printEach(List<T> list){
        for (T each : list) {
            System.out.println(each);

        }
    }

}
