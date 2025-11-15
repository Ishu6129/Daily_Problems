// Last updated: 15/11/2025, 13:17:14
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=numBottles;
        int ans=numBottles;
        while(empty>=numExchange){
            while(empty>=numExchange){
                empty=empty-numExchange;
                numExchange++;
                ans++;
                empty++;
            }
        }
        return ans;
    }
}