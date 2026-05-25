class Solution {
    public boolean isValidSudoku(char[][] board) {
       //{{1,2,3},{1,2,3}} ===> [2][3]
       //[9,9] 2d array
       //set 9sets of columns, 9 sets of columns, 9 sets of boxes
       HashSet<Character>[]columnArray= new HashSet[9];
       HashSet<Character>[]rowArray= new HashSet[9];
       HashSet<Character>[]boxArray= new HashSet[9];
       for(int i=0;i<9;i++){
        columnArray[i]= new HashSet<Character>();
        rowArray[i]= new HashSet<Character>();
        boxArray[i]= new HashSet<Character>();
       }
       
       for(int row=0;row<board.length;row++){
        
        for(int column = 0; column < board[row].length;column++){

            char curr = board[row][column];
            int box = row/3 *3 + column/3;
            if(curr=='.'){
                continue;
            }
            if(!rowArray[row].add(curr) || !columnArray[column].add(curr) || !boxArray[box].add(curr)){
                return false;
            }
        }
        
       }
       return true;
    }
}
