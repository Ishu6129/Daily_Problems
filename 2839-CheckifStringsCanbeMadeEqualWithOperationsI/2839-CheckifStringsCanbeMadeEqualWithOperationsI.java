// Last updated: 29/03/2026, 18:43:28
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        if(s1.equals(s2)) return true;
4        char c0=s1.charAt(0);
5        char c1=s1.charAt(1);
6        char c2=s1.charAt(2);
7        char c3=s1.charAt(3);
8        if((c2+""+c1+c0+c3).equals(s2)) return true;
9        if((c0+""+c3+c2+c1).equals(s2)) return true;
10        if((c2+""+c3+c0+c1).equals(s2)) return true;
11        return false;
12    }
13}