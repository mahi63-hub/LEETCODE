class Solution {
    public int maxProfit(int[] prices) {
        int buy=0,profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[buy]>prices[i]){
                buy=i;
            }
            profit=Math.max(profit, prices[i]-prices[buy]);
        }
        return profit;
    }
}