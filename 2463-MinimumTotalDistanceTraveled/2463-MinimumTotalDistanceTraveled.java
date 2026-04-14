// Last updated: 15/04/2026, 00:17:25
1class Solution {
2    Long dp[][];
3    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
4        dp=new Long[robot.size()][factory.length];
5        Collections.sort(robot);
6        Arrays.sort(factory,(a,b)->a[0]-b[0]);
7        return find(robot,factory,0,0);
8    }
9    public long find(List<Integer> robot,int[][] factory,int rbIdx,int facIdx){
10        if(rbIdx==robot.size()) return 0;
11        if(facIdx==factory.length) return Long.MAX_VALUE;
12        if(dp[rbIdx][facIdx]!=null) return dp[rbIdx][facIdx];
13        long skp=find(robot,factory,rbIdx,facIdx+1);
14        long dist=0;
15        long ans=Long.MAX_VALUE;
16        for(int i=0;i<factory[facIdx][1] && rbIdx+i<robot.size();i++){
17            dist+=Math.abs(robot.get(rbIdx+i)-factory[facIdx][0]);
18            long next=find(robot,factory,rbIdx+i+1,facIdx+1);
19            if(next<Long.MAX_VALUE) ans=Math.min(ans,dist+next);
20        }
21        return dp[rbIdx][facIdx]=Math.min(skp,ans);
22    }
23}