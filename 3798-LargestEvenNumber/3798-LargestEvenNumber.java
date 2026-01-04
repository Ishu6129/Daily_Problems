// Last updated: 04/01/2026, 17:49:41
1class Solution {
2    public String largestEven(String s) {
3        int idx=-1;
4        int i=s.length()-1;
5        while(i>=0){
6            if(s.charAt(i)=='2'){
7                idx=i;
8                break;
9            }
10            i--;
11        }
12        return s.substring(0,idx+1);
13    }
14}