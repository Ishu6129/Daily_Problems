// Last updated: 21/11/2025, 22:23:29
class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Character,Integer> right=new HashMap<>();
        Set<Character> left =new HashSet<>();
        Set<String> ans=new HashSet<>(); 
        for(char i:s.toCharArray()){
            right.put(i,right.getOrDefault(i,0)+1);
        }
        for(char i:s.toCharArray()){
            right.put(i,right.get(i)-1);
            for(char j:left){
                if((right.get(j))>0){
                    ans.add(i+""+j);
                }
            }
            left.add(i);
        }
        return ans.size();
    }
}