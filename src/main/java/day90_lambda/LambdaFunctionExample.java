package day90_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

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

        Predicate<String> predicate1 = t->t.startsWith("R") || t.length() == 5;
        System.out.println(predicate1.test("soly"));

        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get()*100);


        Consumer<String> consumer = System.out::println;
        consumer.accept("Geek");

        Stream.generate(() ->"Ken").limit(10).forEach(System.out::println);





    }
}
