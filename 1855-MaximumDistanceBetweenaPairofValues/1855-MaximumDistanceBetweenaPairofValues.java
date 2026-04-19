// Last updated: 19/04/2026, 21:53:23
1class Solution {
2    int n2;
3    public int maxDistance(int[] nums1, int[] nums2) {
4        n2=nums2.length;
5        int n1=nums1.length;
6        int ans=0;
7        for(int i=0;i<n1;i++){
8            ans=Math.max(ans,binarySearch(nums1[i],i,nums2));
9        }
10        return ans;
11    }
12    public int binarySearch(int num,int st,int[] nums){
13        int lo=st;
14        int hi=n2-1;
15        int ans=-1;
16        while(lo<=hi){
17            int mid=lo+(hi-lo)/2;
18            if(nums[mid]>=num){
19                ans=mid;
20                lo=mid+1;
21            }
22            else hi=mid-1;
23        }
24        return (ans==-1)?0:ans-st;
25    }
26}