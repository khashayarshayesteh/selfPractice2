package day90_lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunctionExample {
    public static void main(String[] args) {


        Function<Integer, Double> function = t -> t / 3.0;

        System.out.println(function.apply(12));
        
//
//        final List<Customer> customerList = null;
//        List<Integer> ids = customerList.stream().map(customer -> Customer.getid()).collect(Collectors.toList());

//        Arrays customerList = null;
//        List<Integer> ids = customerList.stream().map(Customer::getid).collect(Collectors.toList());

        Function<Double,Double> Hassan = t->t/3;
        Function<Double,Double> Mahdi = t->t-2;
        System.out.println(Hassan.andThen(Mahdi).apply(22.0));

        Predicate<String> predicate=t->t.equalsIgnoreCase("kHAshaYar");
        System.out.println(predicate.test("Khashayar"));

        Predicate<String> predicate1 = t->t.startsWith("s") && t.length() == 4;
        System.out.println(predicate1.test("soly"));

    }
}
