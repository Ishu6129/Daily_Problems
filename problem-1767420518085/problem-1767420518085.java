// Last updated: 03/01/2026, 11:38:38
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        int[] ord=new int[n];
4        for(int[] i:edges){
5            ord[i[1]]++;
6        }
7        System.out.println(Arrays.toString(ord));
8        int c=0;
9        int ans=-1;
10        for(int i=0;i<ord.length;i++){
11            if(ord[i]==0){ 
12                ans=i;
13                c++;
14            }
15        }
16        if(c>1) return -1;
17        return ans;    
18    }
19}