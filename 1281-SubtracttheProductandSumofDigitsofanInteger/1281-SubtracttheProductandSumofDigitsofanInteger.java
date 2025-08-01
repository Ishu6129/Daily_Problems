// Last updated: 01/08/2025, 18:26:35
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