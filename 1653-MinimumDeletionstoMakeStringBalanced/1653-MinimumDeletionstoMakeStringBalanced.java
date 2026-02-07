// Last updated: 07/02/2026, 22:54:10
1class Solution {
2    public int minimumDeletions(String s) {
3        int[] cneb=new int[s.length()];
4        int cb=0;
5        for(int i=s.length()-1;i>=0;i--){
6            if(s.charAt(i)=='b') cb++;
7            cneb[i]=cb;
8        }
9        int[] cnsb=new int[s.length()];
10        cb=0;
11        for(int i=0;i<s.length();i++){
12            if(s.charAt(i)=='b') cb++;
13            cnsb[i]=cb;
14        }
15        int ans = Integer.MAX_VALUE;
16        int n=s.length();
17        if(cnsb[n-1]==0) return 0;
18        for (int i = 0; i < n; i++) {
19            int bLeft = (i > 0) ? cnsb[i - 1] : 0;
20            int bRight = cneb[i];
21            int aRight = (n - i) - bRight;
22
23            ans = Math.min(ans, bLeft + aRight);
24        }
25         ans = Math.min(ans, cnsb[n - 1]);
26        return ans;
27    }
28}