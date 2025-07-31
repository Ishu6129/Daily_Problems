// Last updated: 31/07/2025, 19:42:16
class Solution {
    public int romanToInt(String s) {
        int c=0;
        String t="";
        for(int i=0;i<s.length();i++){
            t="";
            String v=Character.toString(s.charAt(i));
            if (v.equals("I")){
                if(i+1<s.length()){
                    t=Character.toString(s.charAt(i+1));
                }
                if (t.equals("X") || t.equals("V") ){c-=1;}
                else{c+=1;}
                }
            else if(v.equals("V")){c+=5;}
            else if(v.equals("X")){
                if(i+1<s.length()){
                    t=Character.toString(s.charAt(i+1));
                    }
                if (t.equals("L") || t.equals("C") ){c-=10;}
                else{c+=10;}
                }
            else if(v.equals("L")){c+=50;}
            else if(v.equals("C")){
                if(i+1<s.length()){
                    t=Character.toString(s.charAt(i+1));
                    }
                if (t.equals("D") || t.equals("M") ){c-=100;}
                else{c+=100;}
                }
            else if(v.equals("D")){c+=500;}
            else if(v.equals("M")){c+=1000;}
        }
        return c;   
    }
}