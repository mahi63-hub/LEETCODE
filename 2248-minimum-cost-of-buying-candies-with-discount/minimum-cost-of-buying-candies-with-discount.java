class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        if(cost.length ==1){
            return cost[0];
        }
        int i=cost.length-2, j=cost.length-1, sum=0;
        while(i>=0 || j>=0){
            sum+=cost[j];
            if(i>=0){
                sum+=cost[i];
            }
            i-=3;
            j-=3;
        }
        return sum;
    }
}