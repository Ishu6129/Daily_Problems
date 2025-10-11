// Last updated: 12/10/2025, 00:54:24
class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] freq=new int[2];
        int i=0;
        int j=0;
        int max=0;
        int ans=0;
        while(j<nums.length){
            freq[nums[j]]++;
            max=Math.max(max,freq[1]);
            int size=(j-i+1);
            if(freq[0]>k){
                freq[nums[i]]--;
                i++;
            }
            size=j-i+1;
            ans=Math.max(ans,size);
            j++;
        }
        return ans;
    }
}