// Last updated: 23/12/2025, 00:48:42
1class Solution {
2    public String pushDominoes(String dominoes) {
3        int dc=0;
4        char pre='L';
5        StringBuilder sb=new StringBuilder();
6        for(char d:dominoes.toCharArray()){
7            if(d=='.') dc++;
8            else{
9                if(d==pre){
10                    add(dc,pre,sb);
11                }
12                else if(pre=='L'){
13                    add(dc,'.',sb);
14                }
15                else{
16                    add(dc/2,'R',sb);
17                    if(dc%2!=0) sb.append('.');
18                    add(dc/2,'L',sb);
19                }
20                sb.append(d);
21                pre=d;
22                dc=0;
23            }
24        }
25        if(pre=='L') add(dc,'.',sb);
26        else add(dc,'R',sb);
27        return sb.toString();
28    }
29    public static void add(int dc,char pre,StringBuilder sb){
30        for(int i=0;i<dc;i++){
31            sb.append(pre);
32        }
33    }
34}