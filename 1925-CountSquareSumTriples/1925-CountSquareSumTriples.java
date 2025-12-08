// Last updated: 08/12/2025, 18:36:05
1class Solution {
2    public int countTriples(int n) {
3    int ans=0;
4     for (int c = 1; c <=n; c++) {
5            int l = 1;
6            int h = c - 1;
7        while(l<=h){
8            int sum = l*l + h*h;
9            int target = c*c;
10            if (sum == target) {
11                ans++;
12                l++;
13                h--;
14            } else if (sum > target) {
15                h--;
16            } else {
17                l++;
18            }
19        }
20    }
21        return ans*2;
22    }
23}