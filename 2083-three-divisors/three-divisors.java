class Solution {
    public boolean isThree(int n) {
        int sqrRoot = (int)Math.sqrt(n);
        if(sqrRoot*sqrRoot!=n || !isPrime(sqrRoot)){
            return false;
        }
        return true;
    }
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}