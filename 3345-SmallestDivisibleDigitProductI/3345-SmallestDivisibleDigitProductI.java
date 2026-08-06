// Last updated: 8/6/2026, 10:28:06 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3       for(int i=n;i<101;i++){
4        if(check(i,t)) return i;
5       }
6       return -1; 
7    }
8    public boolean check(int n,int t){
9        int temp=n;
10        int prod=1;
11        while(temp>0){
12            prod*=(temp%10);
13            temp/=10;
14        }
15        return (prod%t)==0;
16    }
17}