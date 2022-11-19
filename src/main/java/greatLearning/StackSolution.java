package greatLearning;

import java.util.Iterator;
import java.util.Stack;

public class StackSolution {
    public static void main(String[] args) {

        Stack <Integer> s1 = new Stack<>();
        s1.push(2);
        s1.push(9);
        s1.push(4);
        s1.push(5);
        int indexFound = s1.search(12);
        System.out.println("indexFound is: " + indexFound);
        System.out.println(s1);
        Iterator it = s1.iterator();
        while(it.hasNext()){
            Object s2 = it.next();
            System.out.print(s2);
        }
        System.out.println();
        System.out.println("Size of s1: " + s1.size());
        s1.sort(null);
        System.out.println(s1);
        System.out.println();
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);
        boolean status = s1.empty();
        System.out.println(status);
        s1.pop();
        s1.pop();
        boolean status1 = s1.empty();
        System.out.println(status1);




    }
}
