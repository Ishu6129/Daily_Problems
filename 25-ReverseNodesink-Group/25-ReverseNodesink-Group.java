// Last updated: 31/10/2025, 15:45:05
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
    public ListNode reverseKGroup(ListNode head, int k) {
        int size=0;
        ListNode dummy=head;
        while(dummy!=null){
            size++;
            dummy=dummy.next;
        }
        dummy=head;
        ListNode pre=head;
        ListNode ans=new ListNode(-1);
        ListNode curr=ans;
        for(int i=1;i<=size;i++){
            if(i%k==0){
                ListNode temp=dummy.next;
                dummy.next=null;
                curr.next=reverse(pre);
                pre=temp;
                for(int j=0;j<k;j++){
                    curr=curr.next;
                }
                dummy=temp;
            }
            else{
                dummy=dummy.next;
            }
        }
        if (pre != null) curr.next = pre;
        return ans.next;
    }
    public ListNode reverse(ListNode curr){
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}