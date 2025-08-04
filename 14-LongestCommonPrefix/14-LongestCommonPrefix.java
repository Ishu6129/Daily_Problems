// Last updated: 05/08/2025, 00:28:20
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        String ans = strs[0];
        for(int i = 1; i < strs.length; i++) {
            for(int j = 0; j < Math.min(ans.length(), strs[i].length()); j++) {
                if(ans.charAt(j) != strs[i].charAt(j)) {
                    ans = ans.substring(0, j);
                    break;
                }
            }
            ans = ans.substring(0, Math.min(ans.length(), strs[i].length()));
            if(ans.equals("")) return "";
        }
        return ans;
    }
}
