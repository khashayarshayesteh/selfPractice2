package greatLearning;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LList {
    public static void main(String[] args) {

        LinkedList<Integer> l1 =  new LinkedList<>();
        l1.addAll(Arrays.asList(3,7,10));
        System.out.println(l1);
        l1.add(2,5);
        l1.add(52);
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        Iterator it = l1.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println(l1.size());
        boolean b1 = l1.contains(3);
        System.out.println(b1);
        // copy elements from stack to Linked-list
        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();
        s1.push("Hello");
        s1.push("everyone");
        l2.addAll(s1);
        System.out.println(l2);
        Iterator it1  = l2.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next() + " ");
        }
















    }
}
