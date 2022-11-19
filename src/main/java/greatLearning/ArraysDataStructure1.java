package greatLearning;

import java.util.Arrays;

public class ArraysDataStructure1 {

    public static int search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        int a1[] = new int[]{5, 9, 3, 6, 7, 1};
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");

        }

        System.out.println();
        System.out.println();
        System.out.println("result is:  " + search(a1,5));
        Arrays.sort(a1);
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");

        }
        System.out.println();
        System.out.println("result is:  " + search(a1,12));

    }
}

