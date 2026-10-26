class Solution {
    public int coinChange(int[] coins, int amount) {
        /*
            -> Take an array of length amount+1, and fill them with highest amount (amount+1)
            -> store minimum no of numbers required to sum up to a particular numbers.
            -> consider coin from coins : if coin is less than i, update dp as min of (dp[i], dp[j]+1), here dp[j] indicates the min coins required to sum up to dp[j], so we consider that. 
        */ 

        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;

        for(int i=1;i<=amount;i++){
            for(int coin: coins){
                if(i>=coin){
                    dp[i]=Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}