// Last updated: 31/07/2025, 19:33:40
class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==-1){
                arr[s.charAt(i)-'a']=i;
            }
            else{
                arr[s.charAt(i)-'a']=-2;
            }
        }
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0 && (idx==-1 || arr[i]<idx)){
                idx=arr[i];
            }
        }
        return (idx==-1)?-1:idx;
        
    }
}