// Last updated: 7/25/2026, 12:56:39 PM
1class Solution {
2    public int maxProduct(int n) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
4        int t=n;
5        while(t>0){
6            pq.add(t%10);
7            t/=10;
8        }
9        return pq.poll()*pq.poll();
10    }
11}