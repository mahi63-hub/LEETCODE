class Solution {
    public boolean isThree(int n) {
        if(n<=3){
            return false;
        }
        int count=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count+=2;
            }
            if(count>3){
                return false;
            }
        }
        return count==3;
    }
}