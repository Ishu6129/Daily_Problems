// Last updated: 23/03/2026, 23:04:49
1class Solution {
2    public int trap(int[] height) {
3       return traping(height);
4    }
5    public static int traping(int arr[]) {
6		int n=arr.length;
7		int []left=new int[n];
8		int []right=new int[n];
9		left[0]=arr[0];
10		for(int i=1;i<n;i++) {
11			left[i]=Math.max(left[i-1], arr[i]);
12		}
13		right[n-1]=arr[n-1];
14		for(int i=n-2;i>=0;i--) {
15			right[i]=Math.max(right[i+1], arr[i]);
16		}
17		int sum=0;
18		for(int i=1;i<n-1;i++) {
19			sum =sum+Math.min(left[i], right[i] ) -arr[i];
20		}
21		return sum;
22	}
23
24}