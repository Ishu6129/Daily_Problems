// Last updated: 7/31/2026, 5:55:03 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int n=word.length();
4        int[][] map=new int[26][2];
5        for(int i=0;i<26;i++) map[i][0]=i;
6        for(char ch:word.toCharArray()){
7            map[ch-'a'][1]++;
8        }
9        Arrays.sort(map,(a,b)->b[1]-a[1]);
10        int ans=0;
11        int incr=1;
12        int ptr=1;
13        for(int i=0;i<26;i++){
14            if(map[i][1]==0) break;
15            ans+=map[i][1]*incr;
16            ptr++;
17            if(ptr==9){
18                ptr=1;
19                incr++;
20            }
21        }
22        return ans;
23    }
24}