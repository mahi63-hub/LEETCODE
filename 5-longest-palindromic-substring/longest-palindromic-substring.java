class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==0){
            return "";
        }
        String res= s.substring(0, 1);
        for(int i=1;i<n;i++){
            int low= i-1, high=i+1;
            while(low>=0 && high<n){
                if(s.charAt(low) == s.charAt(high)){
                    if(res.length()<high-low+1){
                        res=s.substring(low, high+1);
                    }
                    low--;
                    high++;
                }else{
                    break;
                }
            }
        }

        for(int i=0;i<n-1;i++){
            int low=i, high=i+1;
            while(low>=0 && high<n){
                if(s.charAt(low) == s.charAt(high)){
                    if(res.length()<high-low+1){
                        res=s.substring(low, high+1);
                    }
                    low--;
                    high++;
                }else{
                    break;
                }
            }
        }

        return res;
    }
}