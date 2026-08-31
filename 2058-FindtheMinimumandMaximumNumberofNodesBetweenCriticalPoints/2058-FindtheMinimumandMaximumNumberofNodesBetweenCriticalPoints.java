// Last updated: 8/31/2026, 4:54:31 PM
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
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        int mn=100001;
14        List<Integer> ls=new ArrayList<>();
15        ListNode dummy=head;
16        int c=2;
17        while(dummy.next.next!=null){
18            int pre=dummy.val;
19            int curr=dummy.next.val;
20            int nxt=dummy.next.next.val;
21            if((pre<curr && curr>nxt) || (pre>curr && curr<nxt)) ls.add(c);
22            dummy=dummy.next;
23            c++;
24        }
25        if(c==2 || ls.size()<=1) return new int[]{-1,-1};
26        int n=ls.size();
27        for(int i=1;i<n;i++){
28            mn=Math.min(mn,ls.get(i)-ls.get(i-1));
29        }
30        return new int[]{mn,ls.get(ls.size()-1)-ls.get(0)};
31    }
32}