// Last updated: 6/21/2026, 9:12:14 AM
1class Solution {
2    public int maxDistance(String moves) {
3        int u=0;
4        int d=0;
5        int l=0;
6        int r=0;
7        int c=0;
8        for(char ch:moves.toCharArray()){
9            if(ch=='L') l++;
10            else if(ch=='R') r++;
11            else if(ch=='D') d++;
12            else if(ch=='U') u++;
13            else c++;
14        }
15        return Math.abs(u-d)+Math.abs(l-r)+c;
16    }
17}