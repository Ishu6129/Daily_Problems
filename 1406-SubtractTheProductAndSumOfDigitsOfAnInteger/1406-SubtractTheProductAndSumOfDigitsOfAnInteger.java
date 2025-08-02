// Last updated: 02/08/2025, 23:10:39
class Solution {
    public int subtractProductAndSum(int n) {
        int t=n;
        int prd=1;
        int sm=0;
        while(t>0){
            int r=t%10;
            prd*=r;
            sm+=r;
            t=t/10;
        }
        return prd-sm;
    }

}