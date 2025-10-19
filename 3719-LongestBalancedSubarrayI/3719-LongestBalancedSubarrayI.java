// Last updated: 19/10/2025, 18:54:12
class Solution {
    public int longestBalanced(int[] nums) {
        int mx=0;
        for(int  i=0;i<nums.length-1;i++){
            Set<Integer> odd=new HashSet<>();
            Set<Integer> even=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    even.add(nums[j]);
                }
                else{
                    odd.add(nums[j]);
                }
                if(odd.size()==even.size()){
                    mx=Math.max(mx,j-i+1);
                }
            }
        }
        return mx;
    }
}