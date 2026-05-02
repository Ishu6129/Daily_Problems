// Last updated: 5/2/2026, 7:12:21 PM
1class Solution {
2    public int rotatedDigits(int n) {
3        Map<Integer,Integer> map=new HashMap<>();
4        map.put(0,0);
5        map.put(1,1);
6        map.put(2,5);
7        map.put(5,2);
8        map.put(6,9);
9        map.put(8,8);
10        map.put(9,6);
11        int ans=0;
12        for(int i=2;i<=n;i++){
13            int temp=0;
14            int t=i;
15            boolean flag1=true;
16            boolean flag2=false;
17            while(t>0){
18                int r=t%10;
19                if(!map.containsKey(r)){
20                    flag1=false;
21                    break;
22                }
23                if (map.get(r)!=r){
24                    flag2 = true;
25                }
26                t/=10;
27            }
28            if(flag1 && flag2) {
29                ans++;}
30        }
31        return ans;
32    }
33}