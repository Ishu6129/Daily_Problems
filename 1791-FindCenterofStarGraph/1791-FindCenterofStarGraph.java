// Last updated: 01/01/2026, 10:50:27
1class Solution {
2    public int findCenter(int[][] edges) {
3        int[] arr=new int[edges.length+1];
4        for(int[] i:edges){ arr[i[0]-1]++;arr[i[1]-1]++;}
5        for(int i=0;i<arr.length;i++){if(arr[i]==edges.length) return i+1;}
6        return -1;
7    }
8}