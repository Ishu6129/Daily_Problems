// Last updated: 21/01/2026, 12:37:54
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int num2_bits=count(num2);
4        int x=0;
5        for(int i=30;i>=0;i--){
6            int mask=(1<<i);
7            if((num1&mask)!=0){
8                x|=mask;
9                num2_bits--;
10                if(num2_bits==0) return x;
11            }
12        }
13        for(int i=0;i<=30;i++){
14            int mask=(1<<i);
15            if((num1&mask)==0){
16                x |= mask;
17                num2_bits--;
18                if(num2_bits==0) return x;
19            }
20        }
21        return x;
22    }
23    public int count(int n){
24        int ans=0;
25        while(n>0){
26            n=n&(n-1);
27            ans++;
28        }
29        return ans;
30    }
31}