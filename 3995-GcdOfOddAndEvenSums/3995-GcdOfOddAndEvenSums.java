// Last updated: 24/08/2025, 22:47:36
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n-1);
        while(sumEven!=0){
            int temp=sumEven;
            sumEven=sumOdd%sumEven;
            sumOdd=temp;
        }
        return sumOdd;
    }
}