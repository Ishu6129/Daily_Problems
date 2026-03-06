// Last updated: 06/03/2026, 17:16:07
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        boolean flag=false;
4        for(int i=0;i<s.length();i++){
5            if(flag && s.charAt(i)=='1') return false;
6            if(s.charAt(i)=='1'){
7                while(i<s.length() && s.charAt(i)=='1'){
8                    i++;
9                }
10                flag=true;
11            }
12        }
13        return true;
14    }
15}