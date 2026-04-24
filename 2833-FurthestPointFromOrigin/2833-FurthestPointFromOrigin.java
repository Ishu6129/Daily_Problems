// Last updated: 4/24/2026, 11:40:04 AM
1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int ans=0;
4        int left=0;
5        int right=0;
6        for(int i=0;i<moves.length();i++){
7            if(moves.charAt(i)=='L') left++;
8            else if(moves.charAt(i)=='R')right++;
9        }
10        int c=0;
11        for(int i=0;i<moves.length();i++){
12            char ch=moves.charAt(i);
13            if(ch=='L') c--;
14            else if(ch=='R') c++;
15            else{
16                if(left>right)c--;
17                else c++;
18            }
19        }
20        ans=Math.max(ans,Math.abs(c));
21        return ans;
22    }
23}