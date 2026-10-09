class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length, col=matrix[0].length;

        boolean firstRow = false, firstCol = false;

        for(int j = 0; j < col; j++){
            if(matrix[0][j] == 0) firstRow = true;
        }

        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0) firstCol = true;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        int colIdx=1;
        while(colIdx<col){
            if(matrix[0][colIdx]==0){
                int rowIdx=1;
                while(rowIdx<row){
                    matrix[rowIdx][colIdx]=0;
                    rowIdx++;
                }
            }
            colIdx++;
        }

        int rowIdx=1;
        while(rowIdx<row){
            if(matrix[rowIdx][0]==0){
                colIdx=1;
                while(colIdx<col){
                    matrix[rowIdx][colIdx]=0;
                    colIdx++;
                }
            }
            rowIdx++;
        }

        
        if(firstRow){
            for(int j = 0; j < col; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstCol){
            for(int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
        }
    }
}