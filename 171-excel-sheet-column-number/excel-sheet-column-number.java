class Solution {
    public int titleToNumber(String columnTitle) {
        int i=columnTitle.length()-1,sum=0,j=0;
        while(i>=0){
            int askey=(int)columnTitle.charAt(i)-64;
            sum+=Math.pow(26,j)*askey;
            i--;
            j++;
        }
        return sum;
    }
}