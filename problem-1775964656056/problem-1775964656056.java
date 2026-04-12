// Last updated: 12/04/2026, 09:00:56
1class Solution {
2    public double[] internalAngles(int[] sides) {
3        if((sides[0]+sides[1]<=sides[2])||
4           (sides[1]+sides[2]<=sides[0])||
5           (sides[2]+sides[0]<=sides[1])) return new double[]{};
6        double a=(double)sides[0];
7        double b=(double)sides[1];
8        double c=(double)sides[2];
9        double A=Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
10        double B=Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
11        double C=Math.toDegrees(Math.acos((b*b+a*a-c*c)/(2*b*a)));
12        double[] ans={A,B,C};
13        Arrays.sort(ans);
14        return ans;
15    }
16}