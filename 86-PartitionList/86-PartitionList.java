// Last updated: 12/08/2025, 21:09:48
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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=new ListNode(0,null);
        ListNode ans=temp;
        ListNode dummy=head;
        while(dummy!=null){
            if(dummy.val<x){
                temp.next=new ListNode(dummy.val,null);
                temp=temp.next;
            }
            dummy=dummy.next;
        }
        dummy=head;
        while(dummy!=null){
            if(dummy.val>=x){
                temp.next=new ListNode(dummy.val,null);
                temp=temp.next;
            }
            dummy=dummy.next;
        }
        return ans.next;
    }
}