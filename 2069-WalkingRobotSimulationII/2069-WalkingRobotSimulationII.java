// Last updated: 07/04/2026, 11:45:55
1class Robot {
2    int[][] grid;
3    int m;
4    int n;
5    int x;
6    int y;
7    // 0-East, 1-North, 2-West, 3-South
8    int dir;
9    public Robot(int width, int height) {
10        m=height;
11        n=width;
12        grid=new int[m][n];
13        x=0;
14        y=0;
15    }
16    
17    public void step(int num) {
18        int perimeter=2*(n+m)-4;
19        num=num%perimeter;
20        if (num==0)num=perimeter;
21        for(int i=0;i<num;i++){
22            if(dir==0){
23                if((x+1)<n){
24                    x++;
25                }
26                else{
27                    dir=1;
28                    y++;
29                }
30            }
31            else if(dir==1){
32                if((y+1)<m){
33                    y++;
34                }
35                else{
36                    dir=2;
37                    x--;
38                }
39            }
40            else if(dir==2){
41                if((x-1)>=0){
42                    x--;
43                }
44                else{
45                    dir=3;
46                    y--;
47                }
48            }
49            else{
50                if((y-1)>=0){
51                    y--;
52                }
53                else{
54                    dir=0;
55                    x++;
56                }
57            }
58        }
59    }
60    
61    public int[] getPos() {
62        return new int[]{x,y};
63    }
64    
65    public String getDir() {
66        if(dir==0) return "East";
67        else if(dir==1) return "North";
68        else if (dir==2) return "West";
69        else return "South";
70    }
71}
72
73/**
74 * Your Robot object will be instantiated and called as such:
75 * Robot obj = new Robot(width, height);
76 * obj.step(num);
77 * int[] param_2 = obj.getPos();
78 * String param_3 = obj.getDir();
79 */