class Solution {
    public String convertToTitle(int columnNumber) {
        String st="";
        if(columnNumber<=26){
            st+=(char) (64+columnNumber);
            return st;
        }

        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            st=(char)(65+rem)+st;
            columnNumber=columnNumber/26;
        }
        return st;
    }
}