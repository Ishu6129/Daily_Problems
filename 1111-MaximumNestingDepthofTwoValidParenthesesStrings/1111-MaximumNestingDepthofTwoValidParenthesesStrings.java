// Last updated: 9/30/2026, 5:42:08 PM
1class Solution {
2    public int[] maxDepthAfterSplit(String seq) {
3        int n=seq.length();
4        int[] ans=new int[n];
5        int c=0;
6        for(int i=0;i<n;i++){
7            char ch=seq.charAt(i);
8            if(ch=='('){
9                c++;
10                ans[i]=c%2;
11            }
12            else{
13                ans[i]=c%2;
14                c--;
15            }
16        }
17        return ans;
18    }
19}