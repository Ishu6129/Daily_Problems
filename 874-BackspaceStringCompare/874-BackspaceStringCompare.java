// Last updated: 31/07/2025, 19:33:16
class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1="";
        String t2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                 if (s1.length()<=1){s1="";continue;}
                s1=s1.substring(0,s1.length()-1);
            }
            else{

                s1+=s.charAt(i);
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if (t2.length()<=1){t2="";continue;}
                t2=t2.substring(0,t2.length()-1);
            }
            else{

                t2+=t.charAt(i);
            }
        }
        return s1.equals(t2);
    }
}