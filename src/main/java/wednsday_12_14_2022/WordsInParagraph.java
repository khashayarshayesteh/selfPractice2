package wednsday_12_14_2022;

import java.lang.reflect.Array;
import java.util.*;

public class WordsInParagraph {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please type in your sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.toLowerCase();
        String [] words =sentence.split(" ");

        for (Object s : new LinkedHashSet<>(List.of(words))) {
            System.out.println(s + "=" + Collections.frequency(List.of(words), s));
    }
        System.out.println("--------------------------------------");

    // other solution

               Arrays.stream(words).distinct().forEach( e ->
                System.out.println(e+"="+Arrays.stream(words).filter( p -> p.equals(e)).count() ));
               }
}



