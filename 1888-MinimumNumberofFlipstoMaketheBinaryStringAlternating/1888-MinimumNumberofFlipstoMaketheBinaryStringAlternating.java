// Last updated: 07/03/2026, 23:13:13
1class Solution {
2    public int minFlips(String s) {
3        int n = s.length();
4        String s2 = s+s;
5        int c0 = 0;
6        int c1 = 0;
7        int ans = Integer.MAX_VALUE;
8        for(int i = 0; i < s2.length(); i++){
9            char ch = s2.charAt(i);
10            if((i%2==0 && ch=='1') || (i%2==1 && ch=='0')) c0++;
11            if((i%2==0 && ch=='0') || (i%2==1 && ch=='1')) c1++;
12            if(i >= n){
13                char out = s2.charAt(i - n);
14                if(((i-n)%2==0 && out=='1') || ((i-n)%2==1 && out=='0')) c0--;
15                if(((i-n)%2==0 && out=='0') || ((i-n)%2==1 && out=='1')) c1--;
16            }
17            if(i>=n-1) ans = Math.min(ans, Math.min(c0,c1));
18        }
19
20        return ans;
21    }
22}