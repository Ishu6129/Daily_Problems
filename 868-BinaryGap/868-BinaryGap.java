// Last updated: 22/02/2026, 12:49:08
1class Solution {
2    public int binaryGap(int n) {
3        String s=Integer.toBinaryString(n);
4        int idx=0;
5        while(idx<s.length() && s.charAt(idx)!='1'){
6            idx++;
7        }
8        System.out.println(idx);
9        if(idx==s.length()) return 0;
10        int ans=0;
11        for(int i=idx+1;i<s.length();i++){
12            if(s.charAt(i)=='1'){
13                ans=Math.max(i-idx,ans);
14                idx=i;
15            }
16        }
17        return ans;
18    }
19}