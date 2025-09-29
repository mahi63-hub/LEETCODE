class Solution {
    public void setZeroes(int[][] matrix) {
        Map<Integer,Boolean> rows=new HashMap<>();
        Map<Integer,Boolean> cols=new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.put(i,true);
                    cols.put(j,true);
                }
            }
        }

        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                if (rows.getOrDefault(r, false) || cols.getOrDefault(c, false)) {
                    matrix[r][c] = 0;
                }
            }
        }
    }
}