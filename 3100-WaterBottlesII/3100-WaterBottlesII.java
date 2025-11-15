// Last updated: 15/11/2025, 13:15:50
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=numBottles;
        int ans=numBottles;
        numBottles=0;
        while(empty>=numExchange){
            while(empty>=numExchange){
                empty=empty-numExchange;
                numBottles++;
                numExchange++;
            }
            if(numBottles+empty>=numExchange){
                empty+=numBottles;
                ans+=numBottles;
                numBottles=0;
            }
        }
        return ans+numBottles;
    }
}