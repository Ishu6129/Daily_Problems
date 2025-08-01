// Last updated: 01/08/2025, 22:56:27
class Solution {
   class StringIntPair{
        String str;
        int len;
        public StringIntPair(String str, int len) {
            this.str = str;
            this.len = len;
        }
    }
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return "";
        }
        int max_len=0;
        String ans = ""; 
        for(int i=0;i<s.length();i++){
            StringIntPair even=check(s,i,i+1);
            StringIntPair odd=check(s,i,i);
            if(even.len > max_len) {
                ans = even.str;
                max_len = even.len;
            }
            if(odd.len > max_len) {
                ans = odd.str;
                max_len = odd.len;
            }
        }
        return ans;
    }
    public StringIntPair check(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        int len = r - l - 1;
        String str = s.substring(l + 1, r);
        return new StringIntPair(str,len);
    }

}
