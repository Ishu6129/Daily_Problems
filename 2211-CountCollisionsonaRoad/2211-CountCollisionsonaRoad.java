// Last updated: 04/12/2025, 22:52:45
1class Solution {
2    public int countCollisions(String directions) {
3        int n=directions.length();
4        int i=0;
5        int j=n-1;
6        int ans=0;
7        while(i<n && directions.charAt(i)=='L') i++;
8        while(j>=0 && directions.charAt(j)=='R') j--;
9        for(int d=i;d<=j;d++){
10            if(directions.charAt(d)=='L'||directions.charAt(d)=='R'){
11                ans++;
12            }
13        }
14        return ans;
15    }
16}