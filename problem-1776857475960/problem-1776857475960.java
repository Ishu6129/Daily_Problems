// Last updated: 4/22/2026, 5:01:15 PM
1class Solution {
2    public int largestInteger(int num) {
3        PriorityQueue<Integer> even=new PriorityQueue<>();
4        PriorityQueue<Integer> odd=new PriorityQueue<>();
5        int t=num;
6        while(t>0){
7            int r=t%10;
8            if((r&1)==1) odd.add(r);
9            else even.add(r);
10            t/=10;
11        }
12        StringBuilder ans=new StringBuilder();
13        t=num;
14        while(t>0){
15            int r=t%10;
16            if((r&1)==1) ans.append(odd.poll());
17            else ans.append(even.poll());
18            t/=10;
19        }
20        return Integer.parseInt(ans.reverse().toString());
21    }
22}