// Last updated: 11/12/2025, 18:10:51
1class Solution {
2    public int countCoveredBuildings(int n, int[][] buildings) {
3        Map<Integer,int[]> row=new HashMap<>();
4        Map<Integer,int[]> col=new HashMap<>();
5        for(int i[]:buildings){
6            int x=i[0];
7            int y=i[1];
8            if(!row.containsKey(y)){
9                row.put(y,new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE});
10            }
11            if(!col.containsKey(x)){
12                col.put(x,new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE});
13            }
14            int[] xd=row.get(y);
15            xd[0]=Math.min(xd[0],x);
16            xd[1]=Math.max(xd[1],x);
17            int[] yd=col.get(x);
18            yd[0]=Math.min(yd[0],y);
19            yd[1]=Math.max(yd[1],y);
20        }
21        int ans=0;
22        for(int i[]:buildings){
23            int x=i[0];
24            int y=i[1];
25            int[] r=row.get(y);
26            int[] c=col.get(x);
27            if(x>r[0] && x<r[1] && y>c[0] && y<c[1]) ans++;
28        }
29        return ans;
30    }
31}