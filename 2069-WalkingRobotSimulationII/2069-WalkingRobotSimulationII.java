// Last updated: 07/04/2026, 11:50:02
1class Robot {
2    int m;
3    int n;
4    int x;
5    int y;
6    // 0-East, 1-North, 2-West, 3-South
7    int dir;
8    public Robot(int width, int height) {
9        m=height;
10        n=width;
11        x=0;
12        y=0;
13    }
14    
15    public void step(int num) {
16        int perimeter=2*(n+m)-4;
17        num=num%perimeter;
18        if (num==0)num=perimeter;
19        for(int i=0;i<num;i++){
20            if(dir==0){
21                if((x+1)<n){
22                    x++;
23                }
24                else{
25                    dir=1;
26                    y++;
27                }
28            }
29            else if(dir==1){
30                if((y+1)<m){
31                    y++;
32                }
33                else{
34                    dir=2;
35                    x--;
36                }
37            }
38            else if(dir==2){
39                if((x-1)>=0){
40                    x--;
41                }
42                else{
43                    dir=3;
44                    y--;
45                }
46            }
47            else{
48                if((y-1)>=0){
49                    y--;
50                }
51                else{
52                    dir=0;
53                    x++;
54                }
55            }
56        }
57    }
58    
59    public int[] getPos() {
60        return new int[]{x,y};
61    }
62    
63    public String getDir() {
64        if(dir==0) return "East";
65        else if(dir==1) return "North";
66        else if (dir==2) return "West";
67        else return "South";
68    }
69}
70
71/**
72 * Your Robot object will be instantiated and called as such:
73 * Robot obj = new Robot(width, height);
74 * obj.step(num);
75 * int[] param_2 = obj.getPos();
76 * String param_3 = obj.getDir();
77 */