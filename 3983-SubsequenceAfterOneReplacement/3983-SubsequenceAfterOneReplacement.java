// Last updated: 8/8/2026, 6:00:07 PM
1class Solution {
2    public boolean canMakeSubsequence(String s, String t) {
3        int n1=s.length();
4        int n2=t.length();
5        if(n1>n2) return false;   
6        int[] pre=new int[n1+1];
7        int[] suf=new int[n1+1];
8        Arrays.fill(pre,-1);
9        Arrays.fill(suf,-1);
10        int idx=0;
11        for(int i=0;i<n2;i++){
12            if(idx<n1 &&  s.charAt(idx)==t.charAt(i)){
13                pre[idx+1]=i;
14                idx++;
15            }
16        }
17        idx++;
18        while(idx<=n1) pre[idx++]=n2;
19        suf[n1]=n2;
20        idx=n1-1;
21        for(int i=n2-1;i>=0;i--){
22            if(idx>=0 &&  s.charAt(idx)==t.charAt(i)){
23                suf[idx]=i;
24                idx--;
25            }
26        }
27        for(int i=0;i<n1;i++){
28            if(pre[i]==n2||suf[i+1]==-1) continue;
29            if(pre[i]+1<suf[i+1]) return true;
30        }
31        return false;
32    }
33
34}