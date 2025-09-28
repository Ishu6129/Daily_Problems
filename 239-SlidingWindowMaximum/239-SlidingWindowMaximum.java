// Last updated: 28/09/2025, 22:29:48
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int l = 0, r = 0;

        while (r < n) {
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r]) dq.removeLast();
            dq.addLast(r);
            if (l > dq.peekFirst()) dq.removeFirst();
            if (r + 1 >= k) {
                res[l] = nums[dq.peekFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}
