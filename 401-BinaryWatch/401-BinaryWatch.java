// Last updated: 27/02/2026, 19:56:59
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        if(turnedOn>8) return new ArrayList<>();
4        List<String> ans=new ArrayList<>();
5        for(int i=0;i<=11;i++){
6            for(int j=0;j<=59;j++){
7                int bits=Integer.bitCount(i)+Integer.bitCount(j);
8                if(bits==turnedOn){
9                    String time=i+":";
10                    if(j<10) time+='0';
11                    time+=j;
12                    ans.add(time);
13                }
14            }
15        }
16        return ans;
17    }
18}