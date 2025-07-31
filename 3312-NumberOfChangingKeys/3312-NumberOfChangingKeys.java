// Last updated: 31/07/2025, 19:32:11
class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        char st=s.charAt(0);
        int ans=0;
        for(int i=1;i<s.length();i++){
            char i_s=s.charAt(i);
            if(!(st==i_s)){
                st=i_s;
                ans++;
            }
        }   
        return ans;
    }
}