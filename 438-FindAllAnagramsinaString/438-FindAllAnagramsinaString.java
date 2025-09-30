// Last updated: 30/09/2025, 22:56:17
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()) return new ArrayList<>();
       List<Integer> ans=new ArrayList<>();
       String hashp=GetKey(p);
       String sw="";
       int n=p.length();
       for(int i=0;i<n;i++){
        sw+=s.charAt(i);
       }
       if(GetKey(sw).equals(hashp)) ans.add(0);
       for(int i=1;i<s.length()-n+1;i++){
        sw=sw.substring(1)+s.charAt(i+n-1);
        if(GetKey(sw).equals(hashp)) ans.add(i);
       }
       return ans;
    }


    public String GetKey(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<freq.length;i++){
            sb.append(freq[i]).append(" ");
        }
        return sb.toString();
    }
}