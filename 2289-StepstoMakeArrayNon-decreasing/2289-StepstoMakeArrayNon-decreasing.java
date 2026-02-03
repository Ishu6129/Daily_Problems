// Last updated: 03/02/2026, 14:25:10
1import java.util.*;
2
3class Solution {
4    public int totalSteps(int[] nums) {
5        int ans=0;
6        Stack<int[]> st=new Stack<>();
7        int step;
8        for(int num:nums){
9            step=0;
10            while(!st.isEmpty() && st.peek()[0]<=num) step=Math.max(step,st.pop()[1]);
11            step=st.isEmpty()?0:++step;
12            st.push(new int[]{num,step});
13            ans=Math.max(ans,step);
14        }
15        return ans;
16    }
17}
18