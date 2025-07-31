// Last updated: 31/07/2025, 19:40:44
class Solution {
    public int maxProfit(int[] prices) {
        int pointer=prices[0];
        int profit =0;
        for(int i=1;i<prices.length;i++){
            if(pointer<prices[i]){
                profit=Math.max(profit,prices[i]-pointer);
            }
            else{
                pointer=prices[i];
            }
        }
        return profit;
    }
}