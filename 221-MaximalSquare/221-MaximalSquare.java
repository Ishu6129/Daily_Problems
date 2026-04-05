// Last updated: 05/04/2026, 23:15:13
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3     int m=matrix.length;
4        int n=matrix[0].length;
5        int ans=0;
6        int[] heights = new int[n];
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(matrix[i][j]=='1'){
10                    heights[j]+=1;
11                }
12                else{
13                    heights[j]=0;
14                }
15            }
16            ans=Math.max(ans,largestRectangleArea(heights));
17
18        }
19        return ans;
20    }
21    public int largestRectangleArea(int[] heights) {
22        int n=heights.length;
23        int[] psb=new int[n];
24        int[] nsb=new int[n];
25        Stack<Integer> st=new Stack<>();
26        for(int i=0;i<n;i++){
27            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
28                st.pop();
29            }
30            psb[i]=st.isEmpty()?-1:st.peek();
31            st.push(i);
32        }
33        st.clear();
34        for(int i=n-1;i>=0;i--){
35            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
36                st.pop();
37            }
38            nsb[i]=st.isEmpty()?n:st.peek();
39            st.push(i);
40        }
41        int ans=0;
42        for(int i=0;i<n;i++){
43            if( heights[i]<=(nsb[i]-psb[i]-1) ){
44                ans=Math.max(ans,heights[i]*heights[i]);
45            }
46        }
47        return ans;
48    }
49}
50