// Last updated: 03/02/2026, 11:27:49
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
12    public int[] nextLargerNodes(ListNode head) {
13        ArrayList<Integer> arr=new ArrayList<>();
14        while(head!=null){
15            arr.add(head.val);
16            head=head.next;
17        }
18        Stack<Integer> st=new Stack<>();
19        int[] ans=new int[arr.size()];
20        for(int i=ans.length-1;i>=0;i--){
21            while(!st.isEmpty() && arr.get(i)>=arr.get(st.peek())){
22                st.pop();
23            }
24            ans[i]=st.isEmpty()?0:arr.get(st.peek());
25            st.push(i);
26        }
27        return ans;
28    }
29}