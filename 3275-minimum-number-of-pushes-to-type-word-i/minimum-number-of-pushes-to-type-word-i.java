class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        int res=0, i=1;
        while(len>0){
            if(len<8){
                res+=i*len;
                len-=8;
            }else{
                res+=i*8;
                len-=8;
            }
            i++;
        }
        return res;
    }
}