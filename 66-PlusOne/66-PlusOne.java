// Last updated: 01/01/2026, 23:09:08
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n=digits.length;
4        int d=(digits[n-1]+1)%10;
5        int c=(digits[n-1]+1)/10;
6        digits[n-1]=d;
7        for(int i=n-2;i>=0;i--){
8            d=(digits[i]+c)%10;
9            c=(digits[i]+c)/10;
10            digits[i]=d;
11        }
12        if(c==1){
13            int[] ans=new int[n+1]; 
14            for(int i=1;i<n+1;i++){
15                ans[i]=digits[i-1];
16            }
17            ans[0]=1;
18            return ans;
19        }
20        return digits;
21    }
22}