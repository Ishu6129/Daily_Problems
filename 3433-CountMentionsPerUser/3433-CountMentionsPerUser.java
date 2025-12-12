// Last updated: 12/12/2025, 22:36:30
1class Solution {
2    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
3        int n=numberOfUsers;
4        int[] mentions=new int[n];
5        int[] offline=new int[n];
6        Arrays.fill(offline,-1);
7        events.sort((a, b) -> {
8            int ta = Integer.parseInt(a.get(1));
9            int tb = Integer.parseInt(b.get(1));
10            if (ta != tb) return ta - tb;
11            if (a.get(0).equals(b.get(0))) return 0;
12            if (a.get(0).equals("OFFLINE")) return -1;
13            return 1;
14        });
15        for(List<String> event:events){
16            int ts=Integer.parseInt(event.get(1));
17            for(int i=0;i<n;i++){
18                if(offline[i]!=-1 && offline[i]<= ts) offline[i]=-1;
19            }
20            String msg=event.get(0);
21            if(msg.equals("OFFLINE")){
22                offline[Integer.parseInt(event.get(2))]=ts+60;
23            }
24            else{
25                String[] mstr=event.get(2).split(" ");
26                for(String i:mstr){
27                    if(i.equals("HERE")){
28                        for (int j = 0; j < n; j++) {
29                            if (offline[j] == -1) mentions[j]++;
30                        }
31                    }
32                    else if(i.equals("ALL")){
33                        for (int j = 0; j < n; j++) {
34                            mentions[j]++;
35                        }
36                    }
37                    else{
38                        mentions[Integer.parseInt(i.substring(2))]++;
39                    }
40                }
41            }
42        }
43        return mentions;
44    }
45}