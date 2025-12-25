// Last updated: 25/12/2025, 11:14:11
1class Solution {
2    public int distMoney(int money, int children) {
3        if(money<children)return -1;
4        money -= children; 
5        int exact = money/7;
6        exact = Math.min(exact, children);
7        int remains = children-exact;
8        int left = money-(exact*7);
9        if (exact>0 && remains==1 && left==3) exact--;
10        if (exact==children && left>0) exact--;
11        return exact;
12    }
13}