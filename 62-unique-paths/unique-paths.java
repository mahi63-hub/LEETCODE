class Solution {
    public int uniquePaths(int m, int n) {
        /* 
            -> for every block, we calculate the number of ways to reach that block, (sum of left block, top block, which contains the no. of ways for em)
            -> so for the last block which is [m-1][n-1] we need sum of no of ways to reach its left block [n-2] and top block [m-2]. and for [n-2] we need sum of left and top. it continues.......
        */

        int[][] dp = new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }

        for(int j=0;j<m;j++){
            dp[j][0]=1;
        }

        for(int r=1;r<m;r++){
            for(int c=1;c<n;c++){
                dp[r][c]= dp[r][c-1] + dp[r-1][c];
            }
        }

        return dp[m-1][n-1];
    }
}