// Last updated: 8/19/2026, 4:17:49 PM
1class Solution {
2    public int maxNumberOfFamilies(int n,int[][] rs) {
3        HashMap<Integer,int[]> map=new HashMap<>();
4        for(int[] i:rs){
5            map.putIfAbsent(i[0],new int[10]);
6            map.get(i[0])[i[1]-1]=1;
7        }
8        int ans=(n-map.size())*2;
9        for(int[] i:map.values()){
10            boolean f1=true,f2=true,f3=true;
11            for(int j=1;j<5;j++){
12                if(i[j]==1){
13                    f1=false;
14                    break;
15                }
16            }
17            for(int j=3;j<7;j++){
18                if(i[j]==1){
19                    f2=false;
20                    break;
21                }
22            }
23            for(int j=5;j<9;j++){
24                if(i[j]==1){
25                    f3=false;
26                    break;
27                }
28            }
29            if(f1&&f3) ans+=2;
30            else if(f1||f2||f3) ans+=1;
31        }
32
33        return ans;
34    }
35}