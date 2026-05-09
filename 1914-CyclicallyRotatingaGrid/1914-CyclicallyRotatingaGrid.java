// Last updated: 5/9/2026, 5:19:22 PM
1class Solution {
2    public int[][] rotateGrid(int[][] grid, int k) {
3        int n=grid.length;
4        int m=grid[0].length;
5        for(int i=0;i<Math.min(n,m)/2;i++){
6            rotateKTimes(grid,i,k);
7        }
8        return grid;  
9    }
10    public void rotateKTimes(int[][] grid,int i,int k){
11        int n=grid.length;
12        int m=grid[0].length;
13        int len=2*(n-2*i)+2*(m-2*i)-4;
14        int arr[]=new int[len];
15        int idx=0;
16        //left-forward
17        for(int j=i;j<n-i;j++){
18            arr[idx++]=grid[j][i];
19        }
20        //bottom-forward
21        for(int j=i+1;j<m-i;j++){
22            arr[idx++]=grid[n-i-1][j];
23        }
24        //right-reverse
25        for(int j=n-i-2;j>=i;j--){
26            arr[idx++]=grid[j][m-i-1];
27        }
28        //top-reverse
29        for(int j=m-i-2;j>i;j--){
30            arr[idx++]=grid[i][j];
31        }
32        rotate(arr,k);
33        gridRotate(i,grid,arr);
34    }
35    public void gridRotate(int i,int[][] grid,int[] arr){
36        int n=grid.length;
37        int m=grid[0].length;
38        int idx=0;
39        //left-forward
40        for(int j=i;j<n-i;j++){
41            grid[j][i]=arr[idx++];
42        }
43        //bottom-forward
44        for(int j=i+1;j<m-i;j++){
45            grid[n-i-1][j]=arr[idx++];
46        }
47        //right-reverse
48        for(int j=n-i-2;j>=i;j--){
49            grid[j][m-i-1]=arr[idx++];
50        }
51        //top-reverse
52        for(int j=m-i-2;j>i;j--){
53            grid[i][j]=arr[idx++];
54        }
55    }
56    public void rotate(int[] arr,int k){
57        int n=arr.length;
58        k=k%n;
59        if(k!=0){
60            reverse(arr,0,n-1);
61            reverse(arr,0,k-1);
62            reverse(arr,k,n-1);
63        }
64    }
65    public void reverse(int[] arr,int i,int j){
66        while(i<j){
67            int temp=arr[i];
68            arr[i]=arr[j];
69            arr[j]=temp;
70            i++;
71            j--;
72        }
73    }
74}