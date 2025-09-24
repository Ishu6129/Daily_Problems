// Last updated: 24/09/2025, 22:39:06
class Solution {
    public int maxProduct(int[] nums) {
        int mx = Integer.MIN_VALUE;
        int cmx = 1;
        int cmn =1;
        for (int i = 0; i < nums.length; i++) {
            if (cmx == 0) {
                cmx=1;
            }
            if (cmn ==0) {
                cmn=1;
            }
            cmx = cmx * nums[i];
            cmn =cmn * nums[nums.length-i-1];
            mx = Math.max(mx, Math.max(cmn,cmx));
        }
        return mx;
    }
}
