// Last updated: 04/09/2025, 14:13:08
class Solution {
    public int findClosest(int x, int y, int z) 
    {
        int a = Math.abs(z-x);
        int b=Math.abs(z-y);
        if(a==b)
        {
            return 0;
        }
          if(a<b) return 1;
          else  return 2;     
    }
    // public int numx(int x,int z)
    // {
    //     if(x<z) return inc(x,z);
    //     else   return dec(x,z);  
        
    // }
    
    // public int inc(int a,int b)
    // {
    //     int s=0;
    //     for(int i=a;i<b;i++)
    //     {
    //         if(i==b)
    //         {
    //         break;
    //         }
    //         s++;
    //     }
    //     return s;
    // }
    // public int dec(int a,int b)
    // {
    //     int s=0;
    //     for(int i=a;i>b;i--)
    //     {
    //         s++;
    //     }
    //     return s;
    // }
}