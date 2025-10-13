// Last updated: 13/10/2025, 19:55:01
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        ans.add(words[0]);
        String pre = key(words[0]);
        for (int i=1; i<words.length;i++) {
            String curr=key(words[i]);
            if(!curr.equals(pre)) {
                ans.add(words[i]);
                pre = curr;
            }
        }
        return ans;
    }
    public String key(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:freq){
            sb.append(i).append(" ");
        }
        return sb.toString();
    }
}