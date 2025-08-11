// Last updated: 11/08/2025, 19:26:18
class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int start=1;
        int end=x;
        int mid=-1;
        while(start<=end){
            mid = start + (end - start) / 2;
            if((long)mid*mid>(long)x){
                end=mid-1;
            }
            else if(mid*mid==x){
                return mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}