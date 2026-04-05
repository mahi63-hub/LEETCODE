class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char i:moves.toCharArray()){
            if(i=='U'){
                x--;
            }else if(i=='D'){
                x++;
            }else if(i=='L'){
                y--;
            }else if(i=='R'){
                y++;
            }
        }

        return x==0 && y==0;
    }
}