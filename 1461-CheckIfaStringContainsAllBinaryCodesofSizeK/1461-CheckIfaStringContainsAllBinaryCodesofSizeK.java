// Last updated: 23/02/2026, 15:32:34
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int[] ans=new int[nums.size()];
4        for(int i=0;i<ans.length;i++){
5            for(int j=1;j<=1000;j++){
6                if( (j|(j+1))==nums.get(i) ){
7                    ans[i]=j;
8                    break;
9                }
10            }
11            if(ans[i]==0) ans[i]=-1;
12        }
13        return ans;
14    }
15}