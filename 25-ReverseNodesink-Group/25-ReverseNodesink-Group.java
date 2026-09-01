// Last updated: 9/1/2026, 6:35:55 PM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        int size=0;
14        ListNode dummy=head;
15        while(dummy!=null){
16            size++;
17            dummy=dummy.next;
18        }
19        dummy=head;
20        ListNode pre=head;
21        ListNode ans=new ListNode(-1);
22        ListNode curr=ans;
23        for(int i=1;i<=size;i++){
24            if(i%k==0){
25                ListNode temp=dummy.next;
26                dummy.next=null;
27                curr.next=reverse(pre);
28                pre=temp;
29                for(int j=0;j<k;j++){
30                    curr=curr.next;
31                }
32                dummy=temp;
33            }
34            else{
35                dummy=dummy.next;
36            }
37        }
38        if (pre != null) curr.next = pre;
39        return ans.next;
40    }
41    public ListNode reverse(ListNode curr){
42        ListNode prev=null;
43        while(curr!=null){
44            ListNode temp=curr.next;
45            curr.next=prev;
46            prev=curr;
47            curr=temp;
48        }
49        return prev;
50    }
51}