// Last updated: 12/10/2025, 00:52:51
class Solution {
    public boolean scoreBalance(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-'a')+1;
        }
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=(s.charAt(i)-'a')+1;
            if(sum-c==c) return true;
        }
        return false;
    }
}