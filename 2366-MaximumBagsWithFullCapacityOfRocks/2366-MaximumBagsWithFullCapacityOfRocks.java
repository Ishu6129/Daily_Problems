// Last updated: 12/10/2025, 00:53:32
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        int fullBags = 0;
        for (int need : diff) {
            if (need == 0) {
                fullBags++;
            } else if (additionalRocks >= need) {
                additionalRocks -= need;
                fullBags++;
            } else {
                break;
            }
        }
        return fullBags;
    }
}