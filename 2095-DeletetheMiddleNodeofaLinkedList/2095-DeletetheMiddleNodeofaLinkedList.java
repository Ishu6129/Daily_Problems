// Last updated: 02/02/2026, 11:51:20
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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head.next==null) return null;
14        ListNode dummy=new ListNode(0,head);
15        int n=0;
16        while(dummy.next!=null){
17            n++;
18            dummy=dummy.next;
19        }
20        int r=n/2;
21        dummy=new ListNode(0,head);
22        while(r!=0){
23            dummy=dummy.next;
24            r--;
25        }
26        dummy.next=dummy.next.next;
27        return head;
28    }
29}