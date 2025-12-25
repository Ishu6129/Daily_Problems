// Last updated: 25/12/2025, 21:21:05
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int sumOdd=n*n;
4        int sumEven=n*(n+1);
5        while(sumEven!=0){
6            int temp=sumEven;
7            sumEven=sumOdd%sumEven;
8            sumOdd=temp;
9        }
10        return sumOdd;
11    }
12}