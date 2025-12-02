// Last updated: 03/12/2025, 00:15:28
1class Solution {
2    long mod = 1000000007L;
3    public int countTrapezoids(int[][] points) {
4     HashMap<Integer,Integer> map=new HashMap<>();
5     for(int i[]:points){
6        map.put(i[1],map.getOrDefault(i[1],0)+1);
7     }
8     long ans=0;
9     long t=0;
10     for(int n:map.values()){
11        long ed = (long)n*(n-1)/2%mod;
12        ans=(ans+t*ed%mod)%mod;
13        t=(t+ed)%mod;
14     }
15     return (int)ans;
16    }
17}