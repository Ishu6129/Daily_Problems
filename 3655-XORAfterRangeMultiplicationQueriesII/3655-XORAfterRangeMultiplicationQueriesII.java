// Last updated: 09/04/2026, 15:38:53
1class Solution {
2    public int xorAfterQueries(int[] nums, int[][] queries) {
3        int mod=1_000_000_007;
4        int n=nums.length;
5        double B=Math.sqrt(n);
6        Map<Integer,List<int[]>> map=new HashMap<>();
7        for(int[] q:queries){
8            int idx=q[0];
9            int r=q[1];
10            int k=q[2];
11            int v=q[3];
12            if(k>B){
13                while(idx<=r){
14                    nums[idx]=(int)(((long)nums[idx]*v)%mod);
15                    idx+=k;
16                }
17            }
18            else{
19                if(!map.containsKey(k)) map.put(k,new ArrayList<>());
20                map.get(k).add(new int[]{idx,r,v});
21            }
22        }
23        for(int k:map.keySet()){
24            int[] diff=new int[n+k];
25            Arrays.fill(diff,1);
26            for(int[] q:map.get(k)){
27                int l=q[0];
28                int r=q[1];
29                int v=q[2];
30                diff[l]=(int)(((long)diff[l]*v)%mod);
31                int rp=l+((r-l)/k +1)*k;
32                long inv = modInverse(v, mod);
33                diff[rp] = (int)((diff[rp] * inv) % mod);
34            }
35            for(int i=k;i<n;i++){
36                diff[i]=(int)(((long)diff[i]*diff[i-k])%mod);
37            }
38            for(int i=0;i<n;i++){
39                nums[i]=(int)(((long)nums[i]*diff[i])%mod);
40            }
41            
42        }
43
44        int ans=0;
45        for(int i:nums) ans^=i;
46        return ans;
47    }
48    public long modInverse(long a, int mod) {
49        return pow(a, mod - 2, mod);
50    }
51
52    public long pow(long a, long b, int mod) {
53        long res=1;
54        while (b > 0) {
55            if ((b&1)==1) res=(res*a)%mod;
56            a=(a*a)%mod;
57            b>>=1;
58        }
59        return res;
60    }
61}