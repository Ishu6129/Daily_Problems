// Last updated: 31/07/2025, 19:34:06
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        ListNode temp=node.next;
        node.next=node.next.next;
        temp=null;
    }
}