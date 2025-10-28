// Last updated: 28/10/2025, 17:32:21
class Solution {
    int ans = 0;
    int n;

    public int countValidSelections(int[] nums) {
        n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                dfs(nums, i, 1);
                dfs(nums, i, -1);
            }
        }
        return ans;
    }

    private void dfs(int[] nums, int curr, int dir) {
        if (curr < 0 || curr >= n) {
            for (int val : nums) {
                if (val != 0) return;
            }
            ans++;
            return;
        }
        if (nums[curr] == 0) {
            dfs(nums, curr + dir, dir);
        } else {
            nums[curr]--;
            dfs(nums, curr - dir, -dir);
            nums[curr]++; 
        }
    }
}
