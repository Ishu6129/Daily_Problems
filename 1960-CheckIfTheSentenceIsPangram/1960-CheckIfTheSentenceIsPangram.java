// Last updated: 31/07/2025, 19:32:41
class Solution {
    public boolean checkIfPangram(String sentence) {
        String str="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++){
            if(!sentence.contains(String.valueOf(str.charAt(i)))){
                return false;
            }
        }
        return true;
        
    }
}