// Last updated: 31/07/2025, 19:33:59
class Solution {
    public boolean isAnagram(String s1, String s2) {
      if(s1.length()!=s2.length()) return false;
        int[] frequency=new int[26];
        for(int i=0;i<s1.length();i++){
            frequency[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            frequency[s2.charAt(i)-'a']--;
        }
        for(int count :frequency){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}