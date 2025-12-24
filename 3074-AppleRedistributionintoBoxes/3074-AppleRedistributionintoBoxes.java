// Last updated: 24/12/2025, 20:28:25
1class Solution {
2    public int minimumBoxes(int[] apple, int[] capacity) {
3        Arrays.sort(capacity);
4        int t=0;
5        for(int i:apple) t+=i;
6        int ans=0;
7        int bxc=0;
8        for(int i=capacity.length-1;i>=0;i--){
9            bxc+=capacity[i];
10            ans++;
11            if(bxc>=t) return ans;
12        }
13        return ans;
14    }
15}