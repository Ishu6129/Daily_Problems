// Last updated: 02/08/2025, 23:10:41
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                if(++c==3) return true;
            }
            else{
                c=0;
            }
        }
        return false;
    }
}