// Last updated: 7/20/2026, 8:56:12 AM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int arr[]=new int[n*m];
6        int idx=0;
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                arr[idx++]=grid[i][j];
10            }
11        }
12        rotate(arr,k);
13        int arn=arr.length;
14        List<List<Integer>> ans=new ArrayList<>();
15        List<Integer> ls=new ArrayList<>();
16        for(int i=0;i<arn;i++){
17            int r=i/m;
18            int c=i%n;
19            if(i%n==0) ls=new ArrayList<>();
20            ls.add(arr[i]);
21            if(i%n==(n-1)) ans.add(ls); 
22
23        }
24        return ans;
25    }
26    public void rotate(int[] nums, int k) {
27        k=k%nums.length;
28        Reverse(nums,0,nums.length-1);
29        Reverse(nums,0,k-1);
30        Reverse(nums,k,nums.length-1);
31    }
32    public static void Reverse(int[] arr, int i,int j) {
33		while(i<j) {
34			int tem=arr[i];
35			arr[i]=arr[j];
36			arr[j]=tem;
37			i++;
38			j--;
39		}
40	}
41}