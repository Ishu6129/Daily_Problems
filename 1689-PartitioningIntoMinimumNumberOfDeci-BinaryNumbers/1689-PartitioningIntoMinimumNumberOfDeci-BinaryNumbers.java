// Last updated: 01/03/2026, 17:56:21
1class Solution {
2    public int minPartitions(String n) {
3        for(int i=9;i>=1;i--){
4            if(n.contains(i+""))return i;
5        }
6        return 0;
7    }
8}