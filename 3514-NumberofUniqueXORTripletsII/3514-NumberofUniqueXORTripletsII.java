// Last updated: 7/24/2026, 5:43:25 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        boolean[] hasNum=new boolean[2048];
4        for(int i:nums) hasNum[i]=true;
5        boolean[] pair=new boolean[2048];
6        for(int i=0;i<2048;i++){
7            if(!hasNum[i])continue;
8            for(int j=i;j<2048;j++){
9                if(!hasNum[j])continue;
10                pair[i^j]=true;
11            }
12        }
13        boolean[] trip=new boolean[2048];
14        for(int i=0;i<2048;i++){
15            if(!pair[i])continue;
16            for(int j=i;j<2048;j++){
17                if(!hasNum[j])continue;
18                trip[i^j]=true;
19            }
20        }
21        int ans=0;
22        for(boolean bl:trip){
23            if(bl) ans++;
24        }
25        return ans;
26    }
27}