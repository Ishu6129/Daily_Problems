// Last updated: 26/09/2025, 13:42:49
class Solution {
    public int maxSubarraySumCircular(int[] arr) {
      int totalSum=0;
        int curr_max=0;
        int curr_min=0;
        int max_sum=arr[0];
        int min_sum=arr[0];
        for(int i:arr){
            curr_max=Math.max(i,curr_max+i);
            max_sum=Math.max(max_sum,curr_max);
            curr_min=Math.min(i,curr_min+i);
            min_sum=Math.min(min_sum,curr_min);
            totalSum+=i;
        }
        int kadSum=max_sum;
        int cirSum=totalSum-min_sum;
        if (kadSum < 0) {
            return kadSum;
        }
        return Math.max(kadSum,cirSum);
    }
}