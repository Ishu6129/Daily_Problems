// Last updated: 03/11/2025, 17:13:47
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int t=0;
        char ch=colors.charAt(0);
        boolean flag=false;
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(neededTime[0]);
        for(int i=1;i<colors.length();i++){
            while(i<colors.length() && colors.charAt(i)==ch ){
                arr.add(neededTime[i]);
                flag=true;
                i++;
            }
            if(flag){
                t+=sum(arr);
                System.out.print(t+" ");
                arr.clear();
                flag=false;
            }
            if(i<colors.length()){
                ch=colors.charAt(i);
                arr.clear();
                arr.add(neededTime[i]);
            }
        }
        return t;
    }
    public int sum(ArrayList<Integer> arr){
        int sum = 0, max = 0;
        for (int n : arr) {
            sum += n;
            max = Math.max(max, n);
        }
        return sum - max;
    }
}