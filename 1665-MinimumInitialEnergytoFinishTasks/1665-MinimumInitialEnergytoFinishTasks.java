// Last updated: 5/12/2026, 12:55:19 PM
1class Solution {
2    int tasks[][];
3    int n;
4    public int minimumEffort(int[][] tasks) {
5        this.tasks=tasks;
6        Arrays.sort(tasks,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
7        int low=0;
8        for(int[] t:tasks){
9            low=Math.max(low,Math.max(t[0],t[1]));
10        }
11        int lo=low;
12        int hi=(int)(1e9);
13        int ans=0;
14        while(lo<=hi){
15            int mid=lo+(hi-lo)/2;
16            if(check(mid)){
17                ans=mid;
18                hi=mid-1;
19            }
20            else lo=mid+1;
21        }
22        return ans;
23    }
24    public boolean check(int mid){
25        int c=mid;
26        for(int[] t:tasks){
27            if(c<t[1]) return false;
28            c-=t[0];
29        }
30        return true;
31    }
32}