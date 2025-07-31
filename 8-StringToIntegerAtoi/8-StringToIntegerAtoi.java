// Last updated: 31/07/2025, 19:42:20
class Solution {
    public int myAtoi(String s) {
     int  idx=0;
        int res=0;
        int sign=1;
        while(idx<s.length() && s.charAt(idx)==' '){
            idx++;
        }
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            sign = s.charAt(idx) == '-' ? -1 : 1;
            idx++;
        }
        while(idx<s.length() && s.charAt(idx)>='0' && s.charAt(idx)<='9'){
            if(res>(Integer.MAX_VALUE/10) || (res==Integer.MAX_VALUE/10 && s.charAt(idx)-'0'>7)){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=(res*10)+(s.charAt(idx)-'0');
            idx++;
        }
        return res*sign;
    }
}