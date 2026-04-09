// Last updated: 09/04/2026, 11:45:19
1class Solution {
2    public int[] corpFlightBookings(int[][] bookings, int n) {
3        int[] prefix=new int[n+1];
4        for(int i[] :bookings){
5            prefix[i[0]-1]+=i[2];
6            prefix[i[1]]+=(-i[2]);
7        }
8        for(int i=1;i<n;i++){
9            prefix[i]+=prefix[i-1];
10        }
11        int arr[]=new int[n];
12        for(int i=0;i<n;i++){
13            arr[i]=prefix[i];
14        }
15        return arr;
16    }
17}