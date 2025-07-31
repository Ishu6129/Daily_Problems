// Last updated: 31/07/2025, 19:40:52
class Solution {
    public int[] plusOne(int[] digits) {
        int last=digits[digits.length-1];
        int c=(last+1)/10;
        int s=(last+1)%10;
        int[] arr=new int[digits.length];
        arr[arr.length-1]=s;
        for (int i = digits.length - 2; i > -1; i--) {
            s = digits[i] + c;
            arr[i] = s % 10;
            c = s / 10;
        }
        if(c!=0){
            int[] result = new int[digits.length + 1];
            result[0] = c;
            for (int i = 0; i < arr.length; i++) {
                result[i + 1] = arr[i];
            }
            return (result);
        }
        return (arr);
        }

    }