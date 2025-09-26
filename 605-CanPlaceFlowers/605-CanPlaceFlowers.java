// Last updated: 26/09/2025, 21:41:32
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        if (flowerbed.length > 0 && flowerbed[0] == 0 && (flowerbed.length == 1 || flowerbed[1] == 0)) {    
            flowerbed[0] = 1;
            c++;
            if (c == n) return true;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]!=1 && flowerbed[i+1]!=1 && flowerbed[i]!=1){
                flowerbed[i]=1;
                c++;
            }
            if(c==n) return true;
        }
        int last = flowerbed.length - 1;
        if (flowerbed[last] == 0 && flowerbed[last - 1] == 0) {
            flowerbed[last] = 1;
            c++;
            if (c == n) return true;
        }
        return c>=n;
    }
}