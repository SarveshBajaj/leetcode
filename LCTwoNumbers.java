public class LCTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        int prevSum = 0;
        ListNode head = l3;
        while(l1 != null && l2 != null ){
            int sum = l1.val + l2.val;
            ListNode temp = new ListNode((sum + prevSum)%10);
            if((sum+prevSum)>9)
                prevSum=1;
            else
                prevSum = 0;
            l3.next = temp; 
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            ListNode temp = new ListNode((prevSum + l1.val)%10);
            if((l1.val + prevSum) > 9)
                prevSum = 1;
            else
                prevSum = 0;
            l3.next = temp;
            l3 = l3.next;
            l1=l1.next;
        }
        
        while(l2 != null){
            ListNode temp = new ListNode((prevSum + l2.val)%10);
            if((l2.val + prevSum) > 9)
                prevSum = 1;
            else
                prevSum = 0;
            l3.next = temp;
            l3 = l3.next;
            l2=l2.next;
        }
        
        if(prevSum == 1)
            l3.next = new ListNode(1);
        
        return head.next;
    }

    public static void main(String args []){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(9);


        LCTwoNumbers.addTwoNumbers(l1, l2);
    }
}