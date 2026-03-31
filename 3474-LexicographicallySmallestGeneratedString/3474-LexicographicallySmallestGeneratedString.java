// Last updated: 31/03/2026, 16:45:12
1class Solution {
2    public String generateString(String str1, String str2) {
3        StringBuilder sb=new StringBuilder();
4        int n=str1.length();
5        int m=str2.length();
6        int t=n+m-1;
7        for(int i=0;i<t;i++){
8            sb.append('#');
9        }
10        boolean[] fixed = new boolean[t];
11        for(int i=0;i<n;i++){
12            if(str1.charAt(i)=='T'){
13                for(int j=0;j<m;j++){
14                    fixed[i+j] = true;
15                    if(sb.charAt(i+j)=='#' ||sb.charAt(i+j)==str2.charAt(j)){
16                        sb.setCharAt((i+j),str2.charAt(j));
17                    }
18                    else return "";
19                }
20            }
21        }
22        for(int i = 0; i < sb.length(); i++){
23            if(sb.charAt(i)=='#'){
24                sb.setCharAt(i, 'a');
25            }
26        }
27        for(int i=0;i<n;i++){
28            if(str1.charAt(i)=='F'){
29                boolean match = true;
30                for(int j=0;j<m; j++){
31                    if(sb.charAt(i+j) != str2.charAt(j)){
32                        match = false;
33                        break;
34                    }
35                }
36                if(match){
37                    boolean changed = false;
38
39                    for(int j=m-1; j>=0;j--){
40                        int pos =i+j;
41                        if(!fixed[pos]){
42                            if(sb.charAt(pos)=='a'){
43                                sb.setCharAt(pos,'b');
44                            }
45                            changed = true;
46                            break;
47                        }
48                    }
49                    if(!changed) return "";
50                }
51            }
52        }
53        return sb.toString();
54    }
55}