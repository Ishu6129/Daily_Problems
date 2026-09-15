// Last updated: 9/15/2026, 5:41:09 PM
1class Solution {
2    public int titleToNumber(String t) {
3        int result=0;
4        for(char ch:t.toCharArray())
5            result=result*26+(ch-'A'+1);
6        
7        return result;
8    }
9}