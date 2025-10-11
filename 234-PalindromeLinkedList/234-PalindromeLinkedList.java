// Last updated: 12/10/2025, 00:55:27
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
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode dummy=head;
        while(dummy!=null){
            sb.append(dummy.val);
            dummy=dummy.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}