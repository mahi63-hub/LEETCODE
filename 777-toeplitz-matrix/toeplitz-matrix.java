class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> map = new HashMap<>();
        int row=matrix.length, col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int idx=i-j;
                if(!map.containsKey(idx)){
                    map.put(idx, matrix[i][j]);
                }else{
                    if(map.get(idx)!=matrix[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}