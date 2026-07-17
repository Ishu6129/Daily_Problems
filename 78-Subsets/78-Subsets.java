// Last updated: 7/17/2026, 10:01:07 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        int n=nums.length;
4        int total=1<<n;
5        List<List<Integer>> ans=new ArrayList<>();
6        for(int i=0;i<total;i++){
7            List<Integer> ls=new ArrayList<>();
8            int c=1;
9            int b=i;
10            while(b>0){
11                int r=b&1;
12                if(r==1) ls.add(0,nums[n-c]);
13                c++;
14                b>>=1;
15            }
16            ans.add(ls);
17        }
18        return ans;
19    }
20}