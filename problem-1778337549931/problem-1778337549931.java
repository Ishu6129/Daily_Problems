// Last updated: 5/9/2026, 8:09:09 PM
1class Solution {
2    public int[] scoreValidator(String[] events) {
3        int score=0;
4        int counter=0;
5        Set<String> set=Set.of("0","1","2","3","4","6");
6        for(String i:events){
7            if(set.contains(i)) score+=(i.charAt(0)-'0');
8            else if(i.equals("WD") || i.equals("NB")) score++;
9            else if(i.equals("W")) counter++;
10            if(counter==10) return new int[]{score,counter};
11        }
12        return new int[]{score,counter};
13    }
14}