class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,HashSet<Character>> row=new HashMap<>();
        HashMap<Integer,HashSet<Character>> col=new HashMap<>();
        HashMap<Integer,HashSet<Character>> boxes=new HashMap<>();

        for(int k=0;k<9;k++){
            row.put(k,new HashSet<>());
            col.put(k,new HashSet<>());
            boxes.put(k,new HashSet<>());
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char digi=board[i][j];
                if(digi=='.') continue;

                int boxIndex=(i/3)*3+(j/3);
                if(row.get(i).contains(digi)) return false;
                row.get(i).add(digi);

                if(col.get(j).contains(digi)) return false;
                col.get(j).add(digi);
                
                if(boxes.get(boxIndex).contains(digi)) return false;
                boxes.get(boxIndex).add(digi);

            }
        }
        return true;
    }
}