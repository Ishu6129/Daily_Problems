// Last updated: 31/07/2025, 19:32:47
class Solution {
    public int secondHighest(String s) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            if(48<=s.charAt(i) &&  s.charAt(i)<=57){
                arr.add(Integer.parseInt(Character.toString(s.charAt(i))));
            }
        }
        if(arr.size()==2 && arr.get(0)==arr.get(1)){
            return -1;
        }
        for(int i : arr){
            if(i>first){
                second=first;
                first = i;
            }
            if(i>second && !(i==first)){
                second=i;
            }
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        else{
            return second;
        }
    }
}