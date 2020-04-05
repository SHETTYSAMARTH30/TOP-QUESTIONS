class GameOfLife {
    public void gameOfLife(int[][] board) {
        
        int totalRows = board.length;
        int totalCols = board[0].length;
        
        int neighbors[] = {0,1,-1};
        
        for(int row = 0; row < totalRows; row++){
            for(int col = 0; col < totalCols;col++){
                
                int numLiveCell = 0;
                
                for(int r=0; r<3; r++){
                    for(int c=0;c<3;c++){
                        
                        if(!(neighbors[r] == 0 && neighbors[c] == 0)){
                            int rows = (row + neighbors[r]);
                            int cols = (col + neighbors[c]);
                        
                        
                        if((rows < totalRows && rows >= 0) && (cols < totalCols && cols >= 0)
                          && Math.abs(board[rows][cols]) == 1)
                            numLiveCell+=1;
                        }
                    }
                }
                
                if(board[row][col] == 1 && (numLiveCell < 2 || numLiveCell > 3))
                    board[row][col] = -1;
                
                if(board[row][col] == 0 && (numLiveCell == 3))
                    board[row][col] = 2;
                
            }
        }
        
        for(int i=0;i<totalRows;i++){
            for(int j=0;j<totalCols;j++){
                
                if(board[i][j] >= 1)
                    board[i][j] = 1;
                else
                    board[i][j] = 0;
            }
        }
    }
}
