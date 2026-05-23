// Last updated: 5/23/2026, 9:07:22 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int n=nums.length;
4        if(n<=2){
5            if(n==2){
6                if((nums[0]%k)==(nums[1]%k)) return 1;
7                return 0;
8            }
9            return 0;
10        }
11        int ans=Integer.MAX_VALUE;
12        for(int x=0;x<k;x++){
13            int xc=0;
14            for(int i=0;i<n;i++){
15                if(i%2==0){
16                    if(nums[i]%k!=x){ xc+=Math.min(Math.abs((nums[i]%k)-x),
17                                                            k-Math.abs((nums[i]%k)-x));}
18                }
19            }
20            for(int y=0;y<k;y++){
21                if(y==x) continue;
22                int yc=0;
23                for(int i=0;i<n;i++){
24                    if(i%2!=0){
25                        if(nums[i]%k!=y) {yc+=Math.min(Math.abs((nums[i]%k)-y),
26                                                       k-Math.abs((nums[i]%k)-y));}
27                    }
28                }
29                ans=Math.min(ans,xc+yc);
30            }
31        }
32        return ans;
33    }
34}