// Last updated: 8/23/2026, 11:57:52 AM
1class Solution {
2    public boolean sumGame(String num) {
3        int q1=0;
4        int q2=0;
5        int sm1=0;
6        int sm2=0;
7        int n=num.length();
8        int mid=n/2;
9        int idx=0;
10        for(char ch:num.toCharArray()){
11            if(idx<mid){
12                if(ch=='?') q1++;
13                else sm1+=(ch-'0');
14            }
15            else{
16                if(ch=='?') q2++;
17                else sm2+=(ch-'0');
18            }
19            idx++;
20        }
21        return 2*(sm1-sm2)!=9*(q2-q1);
22    }
23}