// Last updated: 01/01/2026, 22:58:25
1class Solution {
2    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
3        int n=startTime.length;
4        int[][] job=new int[n][3];
5        for (int i=0;i<n;i++) {
6            job[i][0]=startTime[i];
7            job[i][1]=endTime[i];
8            job[i][2]=profit[i];
9        }
10        Arrays.sort(job,(a,b)->a[0]-b[0]);
11        int[]dp=new int[n];
12        Arrays.fill(dp,-1);
13        return find(0,job,dp);
14    }
15    public int find(int idx, int[][] job, int[] dp) {
16        if (idx>= job.length) return 0;
17        if (dp[idx]!=-1) return dp[idx];
18        int next=idx+1;
19        while (next<job.length && job[next][0]<job[idx][1]) {
20            next++;
21        }
22        int pk=job[idx][2]+find(next,job,dp);
23        int npk=find(idx+1,job,dp);
24        return dp[idx]=Math.max(pk,npk);
25    }
26}
27