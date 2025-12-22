// Last updated: 22/12/2025, 17:48:16
1class Solution {
2    public String generateTag(String caption) {
3        caption=caption.strip();
4        String[] str=caption.split(" ");
5        if(str.length==0) return "#";
6        StringBuilder ans=new StringBuilder("#");
7        if(str[0].length()>99){
8            ans.append(str[0].substring(0,99).toLowerCase());
9        }
10        else{
11               ans.append(str[0].toLowerCase());  
12        }
13        for(int i=1;i<str.length;i++){
14            boolean flag=true;
15            for(char ch:str[i].toCharArray()){
16                if(ch<='z' && ch>='a' || ch<='Z' && ch>='A' && ans.length()<=99){
17                    if(flag){
18                        ans.append((ch+"").toUpperCase());
19                        flag=false;    
20                    }
21                    else{
22                        ans.append((ch+"").toLowerCase());
23                    }
24                }
25                if(ans.length()==100) return ans.toString();
26            }
27        }
28        return ans.toString();
29    }
30}