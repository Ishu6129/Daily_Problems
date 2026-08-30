// Last updated: 8/30/2026, 8:31:14 PM
1class Solution {
2    public int maxSum(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        int i=0;
6        int j=0;
7        long sm1=0;
8        long sm2=0;
9        long ans=0;
10        while(i<n && j<m){
11            if(nums1[i]<nums2[j]) sm1+=nums1[i++];
12            else if(nums2[j]<nums1[i]) sm2+=nums2[j++];
13            else{
14                ans+=Math.max(sm1,sm2)+nums1[i];
15                sm1=0;
16                sm2=0;
17                i++;j++;
18            }
19        }
20        while(i<n) sm1+=nums1[i++];
21        while(j<m) sm2+=nums2[j++];
22        ans+=Math.max(sm1,sm2);
23        return  (int) (ans%((int)(1e9+7)));
24    }
25}