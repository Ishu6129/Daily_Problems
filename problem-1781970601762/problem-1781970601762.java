// Last updated: 6/20/2026, 9:20:01 PM
1class Solution {
2    public int minLights(int[] light) {
3        int n=light.length;
4        List<int[]> inter=new ArrayList<>();
5        for(int i=0;i<n;i++){
6            if(light[i]>0){
7                int v=light[i];
8                inter.add(new int[]{
9                    Math.max(0,i-v),
10                    Math.min(n-1,i+v)
11                });
12            }
13        }
14        if(inter.isEmpty()) return (n+2)/3;
15        inter.sort((a,b)-> a[0]-b[0]);
16        int ans=0;
17        int end=-1;
18        for(int[] cur:inter){
19            int l=cur[0];
20            int r=cur[1];
21            if(l>end+1){
22                int gap=l-(end+1);
23                ans+=(gap+2)/3;
24            }
25            end=Math.max(end,r);
26        }
27        if(end<n-1){
28            int gap=n-1-end;
29            ans+=(gap+2)/3;
30        }
31        return ans;
32    }
33}