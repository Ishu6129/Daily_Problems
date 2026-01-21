// Last updated: 21/01/2026, 11:31:41
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int ans=0;
4        for(int i:derived){
5            ans^=i;
6        }
7        return ans==0;
8    }
9}