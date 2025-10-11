// Last updated: 12/10/2025, 00:52:56
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int idx=0;
        int i=0;
        while(i<order.length){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    ans[idx]=order[i];
                    idx++;
                }
            }
            i++;
        }
        return ans;
    }
}