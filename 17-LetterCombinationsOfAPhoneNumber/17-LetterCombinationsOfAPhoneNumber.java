// Last updated: 31/07/2025, 19:42:12
class Solution {
    static String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> answer=new ArrayList<>();
        print(digits,"",answer);
        return answer;

    }
    public static void print(String ques,String ans,List<String> answer){
        if(ques.length()==0){
            if(ans.length()!=0){
                answer.add(ans);
            }
            return;
        }
        char ch=ques.charAt(0);
        String getString=key[ch-48];
        for(int i=0;i<getString.length();i++){
            print(ques.substring(1),ans+getString.charAt(i),answer);
        }
    }
}