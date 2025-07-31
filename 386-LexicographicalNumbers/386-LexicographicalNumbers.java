// Last updated: 31/07/2025, 19:33:41
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        print(n,0,ans);
        return ans;

    }
    public static void print(int n,int curr,List<Integer> ans){
        if(curr>n){
            return;
        }
        if(curr!=0){
        ans.add(curr);}
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            print(n,curr*10+i,ans);
        }
    }
}