// Last updated: 8/4/2026, 6:08:32 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3       Arrays.sort(nums);
4       int n=nums.length;
5       int st=nums[0];
6       int end=nums[n-1];
7       List<Integer> ans=new ArrayList<>();
8       int idx=1;
9       for(int i=st+1;i<end;i++){
10        while(idx<n && nums[idx]!=i){
11            ans.add(i);
12            i++;
13        }
14        idx++;
15       }
16       return ans;
17    }
18}