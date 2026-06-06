// Last updated: 6/6/2026, 8:15:56 PM
1class Solution {
2    public boolean consecutiveSetBits(int n) {
3        String s=Integer.toBinaryString(n);
4        int pr=0;
5        for(int i=1;i<s.length();i++){
6            if(s.charAt(i)==s.charAt(i-1) && s.charAt(i)=='1') pr++;
7        }
8        return pr==1;
9    }
10}