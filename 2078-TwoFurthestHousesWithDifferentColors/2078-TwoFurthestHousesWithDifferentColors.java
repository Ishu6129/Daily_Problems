// Last updated: 20/04/2026, 13:34:05
1class Solution {
2    public int maxDistance(int[] colors) {
3        int ans=0;
4        for(int i=0;i<colors.length;i++){
5            for(int j=i+1;j<colors.length;j++){
6                if(colors[i]!=colors[j]){
7                    ans=Math.max(ans,j-i);
8                }
9            }
10        }
11        return ans;
12    }
13}