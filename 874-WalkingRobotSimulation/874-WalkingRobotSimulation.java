// Last updated: 06/04/2026, 17:25:42
1class Solution {
2    public int robotSim(int[] commands, int[][] obstacles) {
3        HashMap<Integer,Set<Integer>> map=new HashMap<>();
4        int m=obstacles.length;
5        for(int i=0;i<m;i++){
6            if(!map.containsKey(obstacles[i][0])){
7                map.put(obstacles[i][0],new HashSet<>());
8            }
9            map.get(obstacles[i][0]).add(obstacles[i][1]);
10        }
11        int x=0;
12        int y=0;
13        int res=-1;
14        // 0-North, 1-South, 2-East, 3-West
15        int dir=0;
16        int n=commands.length;
17        for(int i=0;i<n;i++){
18            if(commands[i]==-1){
19                if(dir==0) dir=2;
20                else if(dir==1) dir=3;
21                else if(dir==2) dir=1;
22                else dir=0;
23                continue;
24            }
25            else if(commands[i]==-2){
26                if(dir==0) dir=3;
27                else if(dir==1) dir=2;
28                else if(dir==2) dir=0;
29                else dir=1;
30                continue;
31            }
32            if(dir==0){
33                for(int j=0;j<commands[i];j++){
34                    if(map.containsKey(x) && map.get(x).contains(y+1)){
35                        break;
36                    }
37                    y++;
38                }
39            }
40            else if(dir==1){
41                for(int j=0;j<commands[i];j++){
42                    if(map.containsKey(x) && map.get(x).contains(y-1)){
43                        break;
44                    }
45                    y--;
46                }
47            }
48            else if(dir==2){
49                for(int j=0;j<commands[i];j++){
50                    if(map.containsKey(x+1) && map.get(x+1).contains(y)){
51                        break;
52                    }
53                    x++;
54                }
55            }
56            else{
57                for(int j=0;j<commands[i];j++){
58                    if(map.containsKey(x-1) && map.get(x-1).contains(y)){
59                        break;
60                    }
61                    x--;
62                }
63            }
64            res=Math.max(res,((x*x)+(y*y)));
65        }
66        return res;
67    }
68}