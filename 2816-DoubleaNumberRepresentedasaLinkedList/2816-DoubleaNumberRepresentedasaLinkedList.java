// Last updated: 02/02/2026, 14:35:09
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
12    public ListNode doubleIt(ListNode head) {
13        head=reverse(head);
14        ListNode ans=new ListNode();
15        ListNode dummy=ans;
16        int c=0;
17        while(head!=null){
18            int sum=c+head.val*2;
19            int d=sum%10;
20            c=sum/10;
21            dummy.next=new ListNode(d);
22            dummy=dummy.next;
23            head=head.next;
24        }
25        if(c!=0){
26            dummy.next=new ListNode(c);
27        }
28        return reverse(ans.next);
29    }
30    public ListNode reverse(ListNode curr){
31        ListNode prev=null;
32        while(curr!=null){
33            ListNode temp=curr.next;
34            curr.next=prev;
35            prev=curr;
36            curr=temp;
37        }
38        return prev;
39    }
40}