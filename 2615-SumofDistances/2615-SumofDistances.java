// Last updated: 4/23/2026, 9:50:22 PM
1class Solution {
2    public long[] distance(int[] nums) {
3        int n=nums.length;
4        HashMap<Integer,List<Integer>> map=new HashMap<>();
5        for(int i=0;i<n;i++){
6            map.putIfAbsent(nums[i],new ArrayList<>());
7            map.get(nums[i]).add(i);
8        }
9        long[] ans = new long[n];
10        for (List<Integer> idxs : map.values()) {
11            int sz = idxs.size();
12            long totalSum = 0;
13            for (int idx : idxs) {
14                totalSum += idx;
15            }
16            long lSum = 0;
17            long rSum = totalSum;
18            for (int j=0; j<sz;j++) {
19                int idx=idxs.get(j);
20                rSum-=idx;
21                long left = (long) idx*j-lSum;
22                long right = rSum-(long)idx*(sz-j-1);
23                ans[idx]=left+right;
24                lSum += idx;
25            }
26        }
27        return ans;
28    }
29    public long sum(List<Integer> ls){
30        long sum=0;
31        for(int i:ls) sum+=i;
32        return sum;
33    }
34}