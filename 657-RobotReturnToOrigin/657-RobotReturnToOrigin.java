// Last updated: 01/08/2025, 00:36:14
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;

    for(int i=0;i<moves.length();i++){
        char mv=moves.charAt(i);
        if(mv=='U') y++;
        else if(mv=='D') y--;
        else if(mv=='L') x--;
        else x++;
    }
    return x==0 && y==0;
    }
}