// Last updated: 25/12/2025, 12:06:21
1class Solution {
2    public long maximumHappinessSum(int[] happiness, int k) {
3        Arrays.sort(happiness);
4        int i=happiness.length-1;
5        long ans=0;
6        int dec=0;
7        while(k>0){
8            if(happiness[i]-dec<=0) break;
9            ans+=happiness[i]-dec;
10            dec++;
11            k--;
12            i--;
13        }
14        return ans;
15    }
16}