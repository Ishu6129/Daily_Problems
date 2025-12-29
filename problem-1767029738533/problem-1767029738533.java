// Last updated: 29/12/2025, 23:05:38
1class Solution {
2    public int findLengthOfShortestSubarray(int[] arr) {
3        int n=arr.length;
4        int left=0;
5        while (left+1<n && arr[left]<=arr[left+1]){
6            left++;
7        }
8        if (left==n-1) return 0;
9        int right=n-1;
10        while (right>0 && arr[right-1]<=arr[right]){
11            right--;
12        }
13        int ans=Math.min(n-left-1,right);
14        int i=0,j=right;
15        while (i<=left && j<n) {
16            if (arr[i]<=arr[j]) {
17                ans=Math.min(ans,j-i-1);
18                i++;
19            } 
20            else {
21                j++;
22            }
23        }
24        return ans;
25    }
26}
27