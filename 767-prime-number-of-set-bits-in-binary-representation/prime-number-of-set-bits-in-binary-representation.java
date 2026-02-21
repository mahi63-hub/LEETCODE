class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String bin=Integer.toBinaryString(i);
            if(isPrime(Integer.bitCount(i))){
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}