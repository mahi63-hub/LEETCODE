class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin=Integer.toBinaryString(n);
        int i=0;
        while(i<bin.length()-1){
            if(bin.charAt(i)==bin.charAt(i+1)){
                return false;
            }
            i++;
        }
        return true;
    }
}