// Last updated: 19/01/2026, 12:21:14
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        long ans=0;
4        int n=arr.length;
5        Stack<Integer> st=new Stack<>();
6        int[] left=new int[n];
7        int[] right=new int[n];
8        for(int i=0;i<n;i++){
9            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
10                st.pop();
11            }
12            left[i]=st.isEmpty()?-1:st.peek();
13            st.push(i);
14        }
15        st.clear();
16        for(int i=n-1;i>=0;i--){
17            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
18                st.pop();
19            }
20            right[i]=st.isEmpty()?n:st.peek();
21            st.push(i);
22        }
23        for(int i=0;i<n;i++){
24         int s=i-left[i];
25         int e=right[i]-i;
26         ans=(ans+(long)arr[i]*s*e)%((int)(1e9+7));   
27        }
28        return (int)ans;
29    }
30}