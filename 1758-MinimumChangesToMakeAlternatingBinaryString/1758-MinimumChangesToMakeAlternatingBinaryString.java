// Last updated: 05/03/2026, 13:19:03
1class Solution {
2    public int minOperations(String s) {
3       int c0=0;
4       int c1=0;
5       boolean flag=true;
6       for(char ch:s.toCharArray()){
7        if(flag && ch=='1') c0++;
8        else if(!flag && ch=='0') c0++;
9        if(flag && ch=='0') c1++;
10        else if(!flag && ch=='1') c1++;
11        flag=!flag;
12       } 
13       return Math.min(c0,c1);
14    }
15}