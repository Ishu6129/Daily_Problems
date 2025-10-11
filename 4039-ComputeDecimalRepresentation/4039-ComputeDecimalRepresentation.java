// Last updated: 12/10/2025, 00:52:50
class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> list =new ArrayList<>();
        int t=n;
        int tens=0;
        while(t>0){
            int r=t%10;
            if(r!=0){
                list.add(r*(int)(Math.pow(10,tens)));
            }
            tens++;
            t=t/10;
        }
        int[] arr=new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            arr[i]=list.get(arr.length-i-1);
        }
        return arr;
    }
}