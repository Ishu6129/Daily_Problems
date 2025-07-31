// Last updated: 31/07/2025, 19:42:11
class Solution {
    public boolean isValid(String s) {
        if(s.length()<2){
            return false;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{' ){
                st.push(ch);
             }
            else{
                if(!st.isEmpty()){
                    if(ch==')' && st.peek()=='(' || ch==']' && st.peek()=='[' || ch=='}' && st.peek()=='{'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
        }
     } 
     return st.isEmpty();  
    }
}