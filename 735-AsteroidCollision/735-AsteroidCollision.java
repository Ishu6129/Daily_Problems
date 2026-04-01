// Last updated: 01/04/2026, 20:20:49
1class Solution {
2    public int[] asteroidCollision(int[] arr) {
3        int n=arr.length;
4        List<Integer> st_s=new ArrayList<>();
5        Stack<Integer> st_e=new Stack<>();
6        int j=0;
7        while(j<n && arr[j]<0){
8            st_s.add(arr[j]);
9            j++;
10        }
11        int l=n-1;
12        while(l>=0 && arr[l]>=0){
13            st_e.push(arr[l]);
14            l--;
15        }
16        Stack<Integer> mid = new Stack<>();
17        for(int i=j;i<=l;i++){
18            int curr=arr[i];
19            boolean collide=false;
20            while (!mid.isEmpty() && curr<0 && mid.peek()>0) {
21                if (Math.abs(curr)>mid.peek()){
22                    mid.pop();
23                } 
24                else if (Math.abs(curr)==mid.peek()) {
25                    mid.pop();
26                    collide = true;
27                    break;
28                }
29                else {
30                    collide = true;
31                    break;
32                }
33            }
34            if (!collide) {
35                mid.push(curr);
36            }
37        }
38        int ans[] =new int[st_s.size()+mid.size()+st_e.size()];
39        int i=0;
40        for(int ele:st_s) ans[i++]=ele;
41        for (int ele:mid) ans[i++]=ele;
42        while(!st_e.isEmpty()){
43            ans[i++]=st_e.pop();
44        }
45        return ans;
46    }
47}