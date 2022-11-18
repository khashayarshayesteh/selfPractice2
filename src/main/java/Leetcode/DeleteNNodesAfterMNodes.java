package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DeleteNNodesAfterMNodes {


    public static void main(String[] args) {


        Integer[] Given = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
      //  ListNode il = Arrays.asList(Given);
     //   LinkedList<Integer> sll = new LinkedList(list);
     //   deleteNodes(il, 2, 3);


    }


    public static ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode il = new ListNode(0);
        il.next = head;
        ListNode temp = il;
        while (temp != null && temp.next != null) {
            for (int i = 1; i <= m && temp != null && temp.next != null; i++)
                temp = temp.next;
            for (int i = 1; i <= n && temp != null && temp.next != null; i++)
                temp.next = temp.next.next;
        }
        return il.next;
    }

    private static class ListNode {
        public ListNode next;

        public ListNode(int i) {
        }
    }
}

