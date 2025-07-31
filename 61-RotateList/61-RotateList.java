// Last updated: 31/07/2025, 19:40:54
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int cnt=1;
        while(temp.next!=null){
            cnt++;
            temp=temp.next;
        }
        int iter=k%cnt;
        for (int i=0;i<iter;i++){
            head=rotate(head);
        }
        return head;

    }
    public ListNode rotate(ListNode head){
        ListNode dummy=head;
        while(dummy.next.next!=null){
            dummy=dummy.next;
        }
        ListNode node=dummy.next;
        dummy.next=null;
        node.next=head;
        return node;
    }
}