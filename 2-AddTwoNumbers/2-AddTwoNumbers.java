// Last updated: 01/08/2025, 21:38:09
    /**
    * Definition for singly-linked list.
    * public class ListNode {
    *     int val;
    *     ListNode next;
    *     ListNode() {}
    *     ListNode(int val) { this.val = val; }
    *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    * }
    */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp=new ListNode();
            ListNode head=temp;
            int sm=0;
            int cry=0;
            while(l1!=null || l2!=null || cry != 0 ){
                sm=cry;
                if(l1!=null){
                    sm=sm+l1.val;
                    l1=l1.next;
                }
                if(l2!=null){
                sm=sm+l2.val; 
                l2=l2.next;
                }
                cry=sm/10;
                temp.val=sm%10;
                if (l1 != null || l2 != null || cry != 0) {
                    temp.next = new ListNode();
                    temp = temp.next;
                }
            }
            return head;
        }
    }