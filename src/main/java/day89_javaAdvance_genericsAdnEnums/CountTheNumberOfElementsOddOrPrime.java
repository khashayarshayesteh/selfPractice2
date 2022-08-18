package day89_javaAdvance_genericsAdnEnums;

import java.util.Arrays;
import java.util.List;

public class CountTheNumberOfElementsOddOrPrime implements   UnaryPredicate {
    @Override
    public boolean test(Object obj) {
        return false;
    }

//    public static void main(String[] args) {
//
//
//        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
//        int count = countIf(ci, new OddPredicate());
//        System.out.println("Number of odd integers = " + count);
//
//    }
//
//    private static int countIf(List<Integer> ci, OddPredicate oddPredicate) {
//
//
//        return 0;
//    }
//
//    @Override
//    public boolean test(T obj) {
//        return false;
//    }
}

/*
Write a generic method to count the number of elements in a collection that
have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:

public interface UnaryPredicate<T> {
 public boolean test(T obj);
}
Sample output:
List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate());
System.out.println("Number of odd integers = " + count);

 */
