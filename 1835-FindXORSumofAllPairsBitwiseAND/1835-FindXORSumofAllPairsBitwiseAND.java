// Last updated: 21/01/2026, 12:10:36
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1=0;
4        for(int i:arr1){
5            xor1^=i;
6        }
7        int xor2=0;
8        for(int i:arr2){
9            xor2^=i;
10        }
11        return xor1&xor2;
12    }
13}