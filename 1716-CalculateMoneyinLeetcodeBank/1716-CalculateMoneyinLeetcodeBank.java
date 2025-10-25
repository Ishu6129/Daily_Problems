// Last updated: 25/10/2025, 20:43:50
class Solution {
    public int totalMoney(int n) {
        return ((28*(n/7))+(((n/7)-1)*(14 + ((n/7)-2)*7))/2)+((n%7)*((2*((n/7)+1)) +((n%7)-1)))/2;
    }
}