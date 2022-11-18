package Leetcode;

import java.util.Stack;

public class FindAllElementsGreaterThanTheirRight {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 3, 5};
        find(arr);
    }

    public static void find(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }

        Stack<Integer> stack = new Stack<>();


        for (int value : arr) {
            // pop all the elements that are less than the current element
            while (!stack.isEmpty() && stack.peek() < value) {
                stack.pop();
            }

            stack.push(value);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }


}


