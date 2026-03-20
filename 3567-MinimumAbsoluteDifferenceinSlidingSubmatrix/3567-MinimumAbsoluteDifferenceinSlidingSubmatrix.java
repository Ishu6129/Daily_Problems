// Last updated: 20/03/2026, 20:52:18
1class Solution {
2    public int[][] minAbsDiff(int[][] grid, int k) {
3       int m=grid.length;
4       int n=grid[0].length;
5       int[][] ans=new int[m-k+1][n-k+1];
6       for(int i=0;i<(m-k+1);i++){
7            int ans_j=0;
8            for(int j=0;j<(n-k+1);j++){
9                int min=block(grid,i,j,k);
10                ans[i][ans_j++]=(min==Integer.MAX_VALUE?0:min);
11            }
12       } 
13       return ans;
14    }
15
16    public static int block(int[][] grid,int i,int j,int k){
17        int[][] temp=new int[k][k];
18        for(int x = 0;x<k;x++){
19            for(int y=0;y<k;y++){
20                temp[x][y]=grid[i+x][j+y];
21            }
22        }
23        return flatten(temp);
24    }
25
26    public static int flatten(int[][] arr){
27        int[] temp=new int[arr.length*arr.length];
28        int idx=0;
29        for(int[] i:arr){
30            for(int j:i){
31                temp[idx++]=j;
32            }
33        }
34        return find(temp);
35    }
36    public static int find(int[] arr){
37        Arrays.sort(arr);
38        int min=Integer.MAX_VALUE;
39        int n=arr.length;
40        for(int i=1;i<n;i++){
41            if(arr[i]==arr[i-1]) continue;
42            min=Math.min(min,Math.abs(arr[i]-arr[i-1]));
43        }
44        return min;
45    }
46}