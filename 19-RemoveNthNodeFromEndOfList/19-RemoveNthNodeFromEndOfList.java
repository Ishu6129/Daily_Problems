// Last updated: 24/08/2025, 22:50:00
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode initial = new ListNode(0, head);
        ListNode pointer = initial;
        int length=0;
        while(pointer.next!=null){
            pointer=pointer.next;
            length++;
        }
        pointer=initial;
        for(int i=0;i<length-n;i++){
            pointer=pointer.next;
        }
        pointer.next=pointer.next.next;
        return initial.next;
    }
}