// Last updated: 10/12/2025, 21:16:55
1class Solution {
2    public int countPermutations(int[] complexity) {
3        long ans=1;
4        int n=complexity.length;
5        for(int i=1;i<n;i++){
6            if(complexity[i]<=complexity[0]) return 0;
7        }
8        for(int i=1;i<n;i++){
9            ans=(ans*i)%1000000007;
10        }
11        return (int)ans;
12    }
13}