// Last updated: 23/03/2026, 17:49:46
1class Solution {
2    int mod=(int) 1e9+7;
3    public int maxSum(int[] nums1, int[] nums2) {
4        long sum1=0;
5        long sum2=0;
6        long ans=0;
7        int m=nums1.length;
8        int n=nums2.length;
9        int i=0;
10        int j=0;
11        while(i<m && j<n){
12            if(nums1[i]<nums2[j]) sum1+=nums1[i++];
13            else if(nums2[j]<nums1[i]) sum2+=nums2[j++];
14            else{
15                ans+=Math.max(sum1,sum2)+nums1[i];
16                sum1=0;
17                sum2=0;
18                i++;
19                j++;
20            }
21        }
22        while(i<m){
23            sum1+=nums1[i++];
24        }
25        while(j<n) sum2+=nums2[j++];
26        ans+=Math.max(sum1,sum2);
27        return  (int) (ans%mod);
28    }
29}