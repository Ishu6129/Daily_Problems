// Last updated: 9/13/2026, 5:06:21 PM
1class Solution {
2    public int largestOverlap(int[][] img1, int[][] img2) {
3        int n=img1.length;
4        int ans=0;
5        for (int x=-(n-1);x<= n-1;x++) {
6            for (int y=-(n-1);y<=n-1;y++) {
7                ans = Math.max(ans,count(img1,img2,x,y));
8            }
9        }
10        return ans;
11    }
12
13    int count(int[][] a,int[][] b,int x,int y) {
14        int n=a.length;
15        int cnt=0;
16        for (int i=0;i<n;i++) {
17            for (int j=0;j<n;j++) {
18                int p=i+x;
19                int q=j+y;
20                if (p>=0 && p<n && q>=0 && q<n) {
21                    if (a[i][j]==1 && b[p][q]==1) {
22                        cnt++;
23                    }
24                }
25            }
26        }
27        return cnt;
28    }
29}
30