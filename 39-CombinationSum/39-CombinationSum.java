// Last updated: 31/07/2025, 19:41:58
class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int amount) {
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        comb_permutation(coin,amount,l,0,ans);
        return ans;

    }
    public static void comb_permutation(int[] coin,int amount,List<Integer> l,int idx,List<List<Integer>> ans){
        if(amount==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(amount>=coin[i]){
                l.add(coin[i]);
                comb_permutation(coin,amount-coin[i],l,i,ans);
                l.remove(l.size()-1);
            }
        }

    }
}