// Last updated: 6/18/2026, 7:06:16 PM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double hrdeg=((double)hour*30+((double)minutes*0.5))%360;
4        double mindeg=(double)minutes*6;
5        double res=Math.abs(hrdeg-mindeg);
6        return Math.min(res,360-res);
7    }
8}