// Last updated: 21/01/2026, 11:49:53
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        if(nums1.length%2==0 && nums2.length%2==0) return 0;
4        int ans=0;
5        if(nums1.length%2!=0 && nums2.length%2==0){
6            for(int i:nums2){
7                ans^=i;
8            }
9            return ans;
10        }
11        if(nums2.length%2!=0 && nums1.length%2==0){
12            for(int i:nums1){
13                ans^=i;
14            }
15            return ans;
16        }
17        for(int i:nums2){
18                ans^=i;
19        }
20        for(int i:nums1){
21                ans^=i;
22        }
23        return ans;
24    }
25}