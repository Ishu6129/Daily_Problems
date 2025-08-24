// Last updated: 24/08/2025, 22:48:07
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Stack<Integer> even= new Stack<>();
        Stack<Integer> odd = new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1 && i%2==0){
                odd.push(i);
            }
            else if(nums[i]%2==0 && i%2==1){
                even.push(i);
            }
        }
        while(!odd.isEmpty()){
            int ev=even.pop();
            int od=odd.pop();
            int temp=nums[ev];
            nums[ev]=nums[od];
            nums[od]=temp;
        }
        return nums;
    }
}