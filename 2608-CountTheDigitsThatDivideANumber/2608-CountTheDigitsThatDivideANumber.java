// Last updated: 31/07/2025, 19:32:34
class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int t=num;
        while(t>0){
            int r=t%10;
            if(num%r==0)cnt++;
            t=t/10;
        }
        return cnt;
    }
}