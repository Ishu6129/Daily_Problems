// Last updated: 5/31/2026, 7:44:26 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        PriorityQueue<Integer> q=new PriorityQueue<>();
4        for(int i:asteroids) q.add(i);
5        long ms=mass;
6        while(!q.isEmpty()){
7            int ast=q.poll();
8            if(ast>ms) return false;
9            ms+=ast;
10        }
11        return true;
12    }
13}