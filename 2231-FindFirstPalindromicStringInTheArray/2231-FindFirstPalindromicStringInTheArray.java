// Last updated: 31/07/2025, 19:32:37
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            String reversedString = sb.reverse().toString();
            if(words[i].equals(reversedString)){
                return words[i];
            }
        }
        return "";
        
    }
}