// Last updated: 21/10/2025, 16:14:35
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int exc=(empty/numExchange);
            ans+=exc;
            empty=exc+(empty%numExchange);
        }
        return ans;
    }
}