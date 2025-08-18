class Solution {
    public int lengthOfLastWord(String s) {
        int r=s.length()-1,co=0;
        if(s.length()==1){
            return 1;
        }
        while(r>=0){
            if(s.charAt(r) == ' '){
                if(co>0){
                    return co;
                }
            }else{
                co++;
            }
            r--;
        }
        return co;
    }
}