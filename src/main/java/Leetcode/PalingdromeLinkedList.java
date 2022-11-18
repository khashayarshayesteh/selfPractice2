package Leetcode;

import java.util.Arrays;
import java.util.List;

public class PalingdromeLinkedList {


    private class ListNode {
        public ListNode next;
        public boolean val;

        public static void main(String[] args) {


            PalingdromeLinkedList.ListNode next;
            boolean val;
            List<Integer> ListNode = Arrays.asList(7, 8, 5, 8, 7);
        }
    }


    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }


}
