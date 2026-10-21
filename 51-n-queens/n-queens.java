class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        boolean[] cols = new boolean[n];
        char[][] board = new char[n][n];
        for(int j=0;j<n;j++){
            Arrays.fill(board[j], '.');
        }

        solve(0, 0, n, res, board, cols);
        return res;
    }

    public void solve(int row, int col, int n, List<List<String>> res, char[][] board, boolean[] cols){
        if(row==n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=col;i<n;i++){
            if(isSafe(row, i, n, board, cols)){
                board[row][i]='Q';
                cols[i]=true;
                solve(row+1, 0, n, res, board, cols);
                board[row][i]='.';
                cols[i]=false;
            }
        }
        
    }

    public boolean isSafe(int row, int col, int n, char[][] board, boolean[] cols){
        if(cols[col]){
            return false;
        }

        int top= row-1, left= col-1;
        while(top>=0 && left >=0){
            if(board[top][left]=='Q'){
                return false;
            }
            top--;
            left--;
        }

        top= row-1;
        int right= col+1;
        while(top>=0 && right <n){
            if(board[top][right]=='Q'){
                return false;
            }
            top--;
            right++;
        }
        return true;
    }
}