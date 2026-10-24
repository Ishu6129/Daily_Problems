// Last updated: 10/24/2026, 2:38:16 PM
1class Solution {
2    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
3        int start=Math.max(toDays(arriveAlice),toDays(arriveBob));
4        int end=Math.min(toDays(leaveAlice),toDays(leaveBob));
5        return Math.max(0, end-start+1);
6    }
7
8    public int toDays(String date) {
9        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
10        int month=Integer.parseInt(date.substring(0,2));
11        int day=Integer.parseInt(date.substring(3));
12        for (int i=0;i<month-1;i++) day+=days[i];
13        return day;
14    }
15}