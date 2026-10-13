class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        int row=mat.length, col=mat[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int idx=i-j;
                if(!map.containsKey(idx)){
                    map.put(idx, new PriorityQueue<>());
                }
                map.get(idx).offer(mat[i][j]);
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int idx=i-j;
                mat[i][j]=map.get(idx).poll();
            }
        }

        return mat;
    }
}