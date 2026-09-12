// Last updated: 9/12/2026, 6:02:10 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        if(head==null || head.next==null) return head;
14        ListNode dummy=new ListNode();
15        ListNode pre=dummy;
16        ListNode curr=head;
17        while(curr!=null && curr.next!=null){
18            pre.next=curr.next;
19            curr.next=pre.next.next;
20            pre.next.next=curr;
21            pre=curr;
22            curr=curr.next;
23        }
24        return dummy.next;
25    }
26}