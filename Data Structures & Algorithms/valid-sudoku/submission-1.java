class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Initialize hashsets
        HashSet[]boxes = new HashSet[9];
        HashSet[]columns = new HashSet[9];
        HashSet[]rows = new HashSet[9];
        for(int i=0;i<9;i++){
            boxes[i]= new HashSet<>();
            rows[i]= new HashSet<>();
            columns[i]= new HashSet<>();
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                int box = (i/3)*3 + (j/3);
                char num = board[i][j];
                if(num =='.'){
                    continue;
                }
                
                if(!boxes[box].add(num) || !columns[j].add(num) || !rows[i].add(num)){
                    return false;
                }
            }
        }
        return true;
    }
}
