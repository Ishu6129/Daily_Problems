// Last updated: 04/03/2026, 13:54:06
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int n=mat.length;
4        int m=mat[0].length;
5        int[] rc=new int[n];
6        int[] cc=new int[m];
7        for(int i=0;i<n;i++){
8            for(int j=0;j<m;j++){
9                rc[i]+=mat[i][j];
10            }
11        }
12        for(int j=0;j<m;j++){
13            for(int i=0;i<n;i++){
14                cc[j]+=mat[i][j];
15            }
16        }
17        int ans=0;
18       for(int i=0;i<n;i++){
19            for(int j=0;j<m;j++){
20                if(mat[i][j]==1 && rc[i]==1 && cc[j]==1) ans++;
21            }
22        }
23        return ans;
24    }
25}