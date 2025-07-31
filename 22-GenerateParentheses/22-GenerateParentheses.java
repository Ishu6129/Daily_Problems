// Last updated: 31/07/2025, 19:42:08
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generateParenthesis(n,0,0,"",list);
        return list;
    }
     public static void generateParenthesis(int n,int closed,int open,String ans,List<String> list) {
        if(open==n && closed==n){
            list.add(ans);
            return;
        }
        if(open>n || closed >open){
            return;
        }
        generateParenthesis(n,closed,open+1,ans+"(",list);
        generateParenthesis(n,closed+1,open,ans+")",list);
    }
}