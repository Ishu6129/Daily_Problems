// Last updated: 26/03/2026, 16:45:13
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        return Arrays.stream(nums).map(x->x*x).sorted().toArray();
4    }
5}