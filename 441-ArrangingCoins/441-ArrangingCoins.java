// Last updated: 10/18/2026, 6:48:23 PM
1class Solution {
2    public int arrangeCoins(int n) {
3       int ans=1;
4       int l=1;
5       int h=n;
6       while(l<=h){
7        int mid=l+(h-l)/2;
8        long cn = (long)mid*(1+mid)/2;
9        if(cn<=n){
10            ans=mid;
11            l=mid+1;
12        } 
13        else h=mid-1;
14       }
15       return ans;
16    }
17}