// Last updated: 02/04/2026, 19:23:30
1class Solution {
2    public int maximumAmount(int[][] coins) {
3        int m=coins.length;
4        int n=coins[0].length;
5        int[][][] dp=new int[m+1][n+1][3];
6        for(int[][] i:dp){
7            for(int[] j:i){
8                Arrays.fill(j,Integer.MIN_VALUE/2);
9            }
10        }
11        if(coins[m-1][n-1]<0){
12            dp[m-1][n-1][2]=0;
13            dp[m-1][n-1][1]=0;
14            dp[m-1][n-1][0]=coins[m-1][n-1];
15        }
16        else{
17            dp[m-1][n-1][2]=coins[m-1][n-1];
18            dp[m-1][n-1][1]=coins[m-1][n-1];
19            dp[m-1][n-1][0]=coins[m-1][n-1];
20        }
21        for(int i=m-1;i>=0;i--){
22            for(int j=n-1;j>=0;j--){
23                if(i==m-1 && j==n-1) continue;
24                for(int shield=0;shield<=2;shield++){
25                    int skp=Integer.MIN_VALUE/2;
26                    if(shield>0 && coins[i][j]<0){
27                        skp=Math.max(dp[i][j+1][shield-1],dp[i+1][j][shield-1]);
28                    }
29                    int nskp=coins[i][j]+Math.max(dp[i][j+1][shield],dp[i+1][j][shield]);
30                    dp[i][j][shield]=Math.max(dp[i][j][shield],Math.max(skp,nskp));
31                }
32            }
33        }
34        return dp[0][0][2];
35    }
36}