// Last updated: 16/04/2026, 11:57:55
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        Map<Integer,List<Integer>> map=new HashMap<>();
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            map.putIfAbsent(nums[i],new ArrayList<>());
7            map.get(nums[i]).add(i);
8        }
9        int[] ans=new int[queries.length];
10        Arrays.fill(ans,-1);
11        for(int i=0;i<queries.length;i++){
12            if(map.get(nums[queries[i]]).size()==1) continue;
13
14            int idx=Collections.binarySearch(map.get(nums[queries[i]]),queries[i]);
15            
16            int sz=map.get(nums[queries[i]]).size();
17            int preIdx=map.get(nums[queries[i]]).get((idx-1+sz)%sz);
18            int nextIdx=map.get(nums[queries[i]]).get((idx+1)%sz);
19            
20            int pre=Math.abs(preIdx-queries[i]);
21            pre=Math.min(pre,n-pre);
22            
23            int next=Math.abs(nextIdx-queries[i]);
24            next=Math.min(next,n-next);
25
26            ans[i]=Math.min(pre,next);
27        }
28        List<Integer> res=new ArrayList<>();
29        for(int x:ans)res.add(x);
30        return res;
31
32    }
33}