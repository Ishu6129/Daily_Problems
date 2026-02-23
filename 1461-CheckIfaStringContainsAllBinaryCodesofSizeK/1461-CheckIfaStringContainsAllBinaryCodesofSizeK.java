// Last updated: 23/02/2026, 15:34:59
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int[] ans=new int[nums.size()];
4        for(int i=0;i<ans.length;i++){
5            int r=nums.get(i);
6            for(int j=1;j<r;j++){
7                if( (j|(j+1))==nums.get(i) ){
8                    ans[i]=j;
9                    break;
10                }
11            }
12            if(ans[i]==0) ans[i]=-1;
13        }
14        return ans;
15    }
16}