// Last updated: 19/03/2026, 16:21:36
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low=0;
4        int high=0;
5        for(int i:nums){
6            low=Math.max(low,i);
7            high+=i;
8        }
9        while(low<high){
10            int mid=low+(high-low)/2;
11            if(check(nums,mid,k)){
12                high=mid;
13            }
14            else low=mid+1;
15        }
16        return low;
17    }
18    public boolean check(int[] nums,int mid,int k){
19        int c=1;
20        int sum=0;
21        for(int i:nums){
22            if(sum+i>mid){
23                sum=i;
24                c++;
25            }
26            else{
27                sum+=i;
28            }
29            if(c>k) return false;
30        }
31        return true;
32    } 
33}