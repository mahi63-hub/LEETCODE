class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        /*
            -> every part in the s should be in wordDict, every word in wordDict need not to be in s.
            -> we check every substring of s, starting from index 0, 01, 11, 02, 12, 22, 03, 13, 23, 33. that means, we gotta take the left part of s. check if that is present in wordDict, if yes then update the next index  in dp (boolean array) as true;
            -> here we take the left part of every index, and slowly compress the substring from left to right.
            -> here j moves till it reaches i
         */

        int n=s.length();
        boolean[] dp = new boolean[n+1];
        dp[0]=true;

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && wordDict.contains(s.substring(j, i))){
                    dp[i]=true;
                }
            }
        }

        return dp[n];

    }
}