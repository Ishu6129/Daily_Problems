// Last updated: 12/10/2025, 00:54:47
class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        int n = points.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    int[] a = points[i];
                    int[] b = points[j];
                    int[] c = points[k];
                    double area = Math.abs(
                        a[0] * (b[1] - c[1]) +
                        b[0] * (c[1] - a[1]) +
                        c[0] * (a[1] - b[1])
                    ) / 2.0;
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;
    }
}
