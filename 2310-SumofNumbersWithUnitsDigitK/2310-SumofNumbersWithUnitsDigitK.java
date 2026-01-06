// Last updated: 06/01/2026, 17:10:09
1class Solution{
2    public int minimumNumbers(int num,int k){
3        if(num==0) return 0;
4        for(int x=1;x<=10;x++){
5            if((x*k)%10==num%10 && x*k<=num) return x;
6        }
7        return -1;
8    }
9}