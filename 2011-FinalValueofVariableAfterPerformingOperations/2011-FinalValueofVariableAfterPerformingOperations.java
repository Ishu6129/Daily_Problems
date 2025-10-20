// Last updated: 20/10/2025, 12:51:22
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(String s : operations){
            if(s.equals("++X") || s.equals("X++")) x++;
            else x--;
        }

        return x;
    }
}