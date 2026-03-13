// Last updated: 13/03/2026, 23:28:18
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int low=0;
4        int high=25000001;
5        for(int w : weights){
6            low=Math.max(low, w);
7        }
8        while(low<high){
9            int mid=low+(high-low)/2;
10            int cnt=1;
11            int sum=0; 
12            for(int i:weights){
13                if(sum+i>mid){
14                    sum=0;
15                    cnt++;
16                }
17                sum+=i;
18            }
19            if(cnt<=days){
20                high=mid;
21            }
22            else low=mid+1;
23        }
24        return low;
25    }
26}