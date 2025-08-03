// Last updated: 03/08/2025, 21:24:55
class Solution {
    public int maxBalancedShipments(int[] weight) {
         int cnt=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<weight.length;i++){
            while(!st.isEmpty() && weight[st.peek()]<=weight[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                cnt++;
                st.clear();
                continue;
            }
            st.push(i);
        }
        return cnt;
    }
}