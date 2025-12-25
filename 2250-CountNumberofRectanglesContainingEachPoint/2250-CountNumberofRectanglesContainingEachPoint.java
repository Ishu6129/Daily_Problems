// Last updated: 25/12/2025, 22:55:01
1class Solution {
2    public int[] countRectangles(int[][] rectangles, int[][] points) {
3        ArrayList<Integer>[] con=new ArrayList[101];
4        for (int i= 0;i<=100;i++){
5            con[i] = new ArrayList<>();
6        }
7        for (int i=0;i<rectangles.length;i++){
8            con[rectangles[i][1]].add(rectangles[i][0]);
9        }
10        for(ArrayList<Integer> cn:con){
11            Collections.sort(cn);
12        }
13
14        int[] ans=new int[points.length];
15        for(int i=0;i<points.length;i++){
16            int x=points[i][0];
17            int y=points[i][1];
18            int count=0;
19            for(int h=y;h<=100;h++){
20                List<Integer> list = con[h];
21                if (!list.isEmpty()) {
22                    int idx =Collections.binarySearch(list, x);
23                    if (idx<0) idx= (-idx-1);
24                    count+= list.size()-idx;
25                }
26            }
27            ans[i]=count;
28        }
29        return ans;
30    }
31}