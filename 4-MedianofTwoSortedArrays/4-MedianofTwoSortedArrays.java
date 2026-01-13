// Last updated: 13/01/2026, 12:11:46
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        int[] nums=new int[n+m];
6        int idx=0;
7        for(int i=0;i<n;i++){
8            nums[idx++]=nums1[i];
9        }
10        for(int i=0;i<m;i++){
11            nums[idx++]=nums2[i];
12        }
13        Arrays.sort(nums);
14        int mid=nums.length/2;
15        System.out.println(mid);
16        if((n+m)%2==0){
17            return ((double)nums[mid]+(double)nums[mid-1])/2;
18        }
19        return (double)nums[mid];
20    }
21}