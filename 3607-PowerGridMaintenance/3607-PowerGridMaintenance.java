// Last updated: 13/11/2025, 18:26:36
class Solution {
    public int maxOperations(String s) {
        int ans = 0;
        int mul = 0;
        int n=s.length()-1;
        boolean flag=true;
        while(n>=0){
            if(s.charAt(n)=='1'){
                ans+=mul;
                flag=true;
            }
            if(flag && s.charAt(n)=='0'){
                flag=false;
                mul++;
            } 
            n--;
        }
        return ans;
    }
}
