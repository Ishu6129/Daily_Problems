// Last updated: 4/25/2026, 5:00:52 PM
1class Solution {
2    public int maxDistance(int side, int[][] points, int k) {
3        int n=points.length;
4        long[] dis=new long[n];
5        for(int i=0;i<n;i++){
6            int x=points[i][0];
7            int y=points[i][1];
8            if(x==0){
9                dis[i]=y;
10            }
11            else if(y==side){
12                dis[i]=side+x;
13            }
14            else if(x==side){
15                dis[i]=3L*side-y;
16            }
17            else{
18                dis[i]=4L*side-x;
19            }
20        }
21        Arrays.sort(dis);
22        long lo=0;
23        long hi=2L*side;
24        int ans=0;
25        while(lo<=hi){
26            long mid=lo+(hi-lo)/2;
27            if(check(dis,side,k,mid)){
28                lo=mid+1;
29                ans=(int)mid;
30            }
31            else hi=mid-1;
32        }
33        return ans;
34    }
35    public boolean check(long[] dis,int side,int k,long mid){
36        long peri=4L*side;
37        int n=dis.length;
38        for(int i=0;i<n;i++){
39            long start=dis[i];
40            long end=start+peri-mid;
41            for(int j=0;j<k-1;j++){
42                int next=lower(dis,start+mid);
43                if(next>=dis.length || dis[next]>end){
44                    start=-1;
45                    break;
46                }
47                start=dis[next];
48            }
49            if(start>=0) return true;
50        }
51        return false;
52    }
53    public int lower(long[] dis,long target){
54        int lo=0;
55        int hi=dis.length;
56        while(lo<hi){
57            int mid=lo+(hi-lo)/2;
58            if(dis[mid]<target){
59              lo=mid+1;  
60            }
61            else hi=mid;
62        }
63        return lo;
64    }
65}   