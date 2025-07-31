// Last updated: 31/07/2025, 19:32:31
class Solution {
    public int sumOfMultiples(int n) {
        int sm=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0  || i%7==0 ){
                sm+=i;
            }
        }
        return sm;   
    }
}