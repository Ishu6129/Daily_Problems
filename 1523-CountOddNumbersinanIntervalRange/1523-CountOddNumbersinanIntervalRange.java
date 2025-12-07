// Last updated: 07/12/2025, 18:15:39
1class Solution {
2    public int countOdds(int low, int high) {
3        if(low==high && (low&1)==1) return 1;
4        if(((high-low+1)&1)==0){
5            return (high-low+1)/2;
6        }
7        if( ((low & 1)==1 && (high & 1)==0) || ((low & 1)==0 && (high&1)==1)  ){
8            return (high-low)/2+1;
9        }
10        if((low&1)==1 && (high&1)==1){
11            return ((high-low-1)/2)+2;
12        }
13        return ((high-low)/2);
14    }
15}