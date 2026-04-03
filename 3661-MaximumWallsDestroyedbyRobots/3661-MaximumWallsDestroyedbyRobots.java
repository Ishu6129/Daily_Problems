// Last updated: 03/04/2026, 16:34:07
1class Solution {
2    public int maxWalls(int[] robots, int[] distance, int[] walls) {
3        int n=robots.length;
4        int[][] r=new int[n+2][2];
5        for(int i=0;i<n;i++){
6            r[i][0]=robots[i];
7            r[i][1]=distance[i];
8        }
9        r[n][0]=-1;
10        r[n][1]=0;
11        r[n+1][0]=Integer.MAX_VALUE;
12        r[n+1][1]=0;
13        Arrays.sort(r, (a,b)->Integer.compare(a[0],b[0]));
14        Arrays.sort(walls);
15
16        int LL=0,LR=1,RL=2,RR=3;
17        int[] dp=new int[4];
18        int leftRobot=0,rightRobot=1;
19        for(int wall:walls){
20            while(wall>r[rightRobot][0]){
21                leftRobot++;
22                rightRobot++;
23                int maxL=Math.max(dp[LL],dp[RL]);
24                int maxR=Math.max(dp[LR],dp[RR]);
25                dp[LL]=maxL;
26                dp[LR]=maxL;
27                dp[RL]=maxR;
28                dp[RR]=maxR;
29            }
30
31            int r1Reach=r[leftRobot][0]+r[leftRobot][1];
32            int r2Reach=r[rightRobot][0]-r[rightRobot][1];
33            boolean canR1=wall<=r1Reach;
34            boolean canR2=wall>=r2Reach;
35
36            boolean isRightPoint=wall==r[rightRobot][0];
37
38            //LL
39            if(canR2) dp[LL]++;
40            //LR
41            if(isRightPoint) dp[LR]++;
42            //RL
43            if(canR1 || canR2) dp[RL]++;
44            //RR
45            if(canR1 || isRightPoint) dp[RR]++;
46        }
47        int ans=0;
48        for(int v:dp){
49            ans=Math.max(v,ans);
50        }
51        return ans;
52    }
53}