// Last updated: 01/10/2025, 00:03:45
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int i=0;
        int j=0;
        int max=0;
        int ans=0;
        while(j<s.length()){
            freq[s.charAt(j)-'A']++;
            max=Math.max(max,freq[s.charAt(j)-'A']);
            int size=(j-i+1);
            if(size-max>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
                size = (j-i+1);
            ans=Math.max(ans,size);
            j++;
        }
        return ans;
    }
}