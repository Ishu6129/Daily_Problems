// Last updated: 11/26/2026, 11:39:03 AM
1class Solution {
2    public boolean canAliceWin(int n) {
3        int t=10;
4        int turn=0;
5        while(t<=n){
6            n-=t;
7            t--;
8            turn=1-turn;
9        }
10        return turn==0?false:true;
11    }
12}