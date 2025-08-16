// Last updated: 16/08/2025, 19:48:12
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0,head);
        ListNode pointer=dummy;
        while(pointer.next!=null){
            if(pointer.next.val==val){
                pointer.next=pointer.next.next;
            }
            else{
                pointer=pointer.next;
            }
        }
        return dummy.next;
    }
}