// Last updated: 01/08/2025, 00:35:39
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s_sum = 0;
        int d_sum = 0;
        
        for(int num : nums) {
            if(num < 10) s_sum += num;
            else d_sum += num;
        }
        
        return s_sum != d_sum;
    }
}
