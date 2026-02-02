// Last updated: 02/02/2026, 12:38:57
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
12    public ListNode doubleIt(ListNode head1) {
13        ListNode l1=reverse(head1);
14        ListNode l2=l1;
15        ListNode temp=new ListNode();
16        ListNode head=temp;
17        int sm=0;
18        int cry=0;
19        while(l1!=null || l2!=null || cry != 0 ){
20            sm=cry;
21            if(l1!=null){
22                sm=sm+l1.val;
23                l1=l1.next;
24            }
25            if(l2!=null){
26            sm=sm+l2.val; 
27            l2=l2.next;
28            }
29            cry=sm/10;
30            temp.val=sm%10;
31            if (l1 != null || l2 != null || cry != 0) {
32                temp.next = new ListNode();
33                temp = temp.next;
34            }
35        }
36        return reverse(head);
37    }
38    public ListNode reverse(ListNode curr){
39        ListNode prev=null;
40        while(curr!=null){
41            ListNode temp=curr.next;
42            curr.next=prev;
43            prev=curr;
44            curr=temp;
45        }
46        return prev;
47    }
48}