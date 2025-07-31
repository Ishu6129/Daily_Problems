// Last updated: 31/07/2025, 19:33:40
class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            char s=operations[i].charAt(0);
            if(s=='C'){
                int rm=st.pop();
                sum=sum-rm;
            }
            else if(s=='D'){
                sum=sum+st.peek()*2;
                st.push(st.peek()*2);
            }
            else if(s=='+'){
                int plus=st.peek();
                int rm=st.pop();
                plus+=st.peek();
                st.push(rm);
                st.push(plus);
                sum+=plus;
            }
            else{
                st.push(Integer.parseInt(operations[i]));
                sum=sum+(Integer.parseInt(operations[i]));
            }
        }
        return sum;
    }
}