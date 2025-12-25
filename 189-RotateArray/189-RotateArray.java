// Last updated: 25/12/2025, 21:17:01
1class Solution {
2    public void rotate(int[] nums, int k) {
3     k=k%nums.length;
4     Reverse(nums,0,nums.length-1);
5     Reverse(nums,0,k-1);
6     Reverse(nums,k,nums.length-1);
7    }
8    public static void Reverse(int[] arr, int i,int j) {
9		while(i<j) {
10			int tem=arr[i];
11			arr[i]=arr[j];
12			arr[j]=tem;
13			i++;
14			j--;
15		}
16	}
17}