package day89_javaAdvance_genericsAdnEnums;

import java.util.ArrayList;

public class EnumsPractice {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<String>();
        names.add("Java");

        // you can pass any type of ArrayList of to both methods
        printRawTypeList(names);

        printWildcardList(names);
    }

    public static void printRawTypeList(ArrayList rawType) {
        for (Object obj : rawType) {
            System.out.println(obj);
        }
        rawType.add(101); // OK
        rawType.add("101"); // OK
        rawType.add(121.00); // OK
    }

    public static void printWildcardList(ArrayList<?> unbounded) {

        // since ? doesn't specify any type, you can simply use object
        for (Object obj : unbounded) {
            System.out.println(obj);
        }

//        unbounded.add(101); // NOT OK
//        unbounded.add("101"); // NOT OK
//        unbounded.add(121.00); //Not OK
    }

}