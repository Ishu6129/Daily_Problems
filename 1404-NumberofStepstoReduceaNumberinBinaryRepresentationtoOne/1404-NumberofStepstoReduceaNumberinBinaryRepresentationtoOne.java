// Last updated: 26/02/2026, 15:39:11
1import java.math.BigInteger;
2class Solution {
3    public int numSteps(String s) {
4       int ans=0;
5       BigInteger n = new BigInteger(s, 2);
6       while (!n.equals(BigInteger.ONE)) {
7            if (n.and(BigInteger.ONE).equals(BigInteger.ZERO)) {
8                ans++;
9            } 
10            else{
11                n=n.add(BigInteger.ONE);
12                ans+= 2;
13            }
14            n=n.shiftRight(1);
15       } 
16       return ans;
17    }
18}