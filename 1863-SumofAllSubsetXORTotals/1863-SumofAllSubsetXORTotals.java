// Last updated: 29/12/2025, 22:26:07
1class Solution {
2    int sum=0;
3    public int subsetXORSum(int[] nums) {
4        sub(nums, 0, new ArrayList<Integer>());
5        return sum;
6    }
7
8    public void sub(int[] nums, int idx, List<Integer> current) {
9        if (idx==nums.length) {
10            sum+=xor(current);
11            return;
12        }
13        sub(nums,idx+1, current);
14        current.add(nums[idx]);
15        sub(nums,idx+1, current);
16        current.remove(current.size()-1);
17    }
18    public int xor(List<Integer> arr){
19        int ans=0;
20        for(int i:arr){
21            ans^=i;
22        }
23        return ans;
24    }
25}