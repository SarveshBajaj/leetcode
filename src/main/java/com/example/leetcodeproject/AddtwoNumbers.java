package main.java.com.example.leetcodeproject;

import java.util.List;

public class AddtwoNumbers {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode newList = null;
        while(l1!=null && l2!=null){
            int digit = (l1.val+l2.val+carry);
            carry = digit>=10 ? 1 : 0;
            newList = putToEnd(newList, digit%10);
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null) {
            newList = putToEnd(newList, (l1.val+carry%10));
            carry = 0;
            l1 = l1.next;
        }

        while(l2!=null) {
            newList = putToEnd(newList, (l2.val+carry%10));
            carry = 0;
            l2 = l2.next;
        }

        return newList;
    }

    public static ListNode putToEnd(ListNode head, int value){
        if(head!=null){
            ListNode node = head;
            while(node.next!=null){
                node = node.next;
            }
            node.next = new ListNode(value);
            return head;
        }
        else
            return new ListNode(value);
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addTwoNumbers(l1,l2);
    }

}
//[9,9,9,9,9,9,9]
//[9,9,9,9]