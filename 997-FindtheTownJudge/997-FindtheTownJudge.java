// Last updated: 30/12/2025, 19:13:01
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int[][] arr=new int[n][n];
4        for(int i=0;i<trust.length;i++){
5            arr[trust[i][0]-1][trust[i][1]-1]=1;
6        }
7        for(int i=0;i<n;i++){
8            if(h_check(arr[i])){
9                if(v_check(arr,i)) return i+1;
10            }
11        }
12        return -1;
13    }
14    public boolean h_check(int[] arr){
15        for(int i=0;i<arr.length;i++){
16            if(arr[i]==1)return false;
17        }
18        return true;
19    }
20    public boolean v_check(int[][] arr,int idx){
21        int c=0;
22        for(int i=0;i<arr.length;i++){
23            if(arr[i][idx]==1){
24                c++;
25            }
26        }
27        return c==arr.length-1;
28    }
29}