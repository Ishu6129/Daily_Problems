// Last updated: 20/12/2025, 16:40:20
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int ans=0;
4        for(int i=0;i<strs[0].length();i++){
5            for(int j=1;j<strs.length;j++){
6                if( (strs[j-1].charAt(i)-'0')>(strs[j].charAt(i)-'0') ) {
7                    ans++;
8                    break;
9                }
10        
11            }
12        }
13        return ans;
14    }
15}