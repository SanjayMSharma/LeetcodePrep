package com.interviewPrep.leetCode.medium;

public class GameOfLife {
    public int[][] gamesOfLife(int[][] board) {
        int rowLen = board.length;
        int colLen = board[0].length;
        int[][] rtnBoard = new int[rowLen][colLen];

        for (int rowIndx = 0; rowIndx < rowLen; rowIndx++) {
            for (int colIndx = 0; colIndx < colLen; colIndx++) {
                int isAlive = isAlive(board, rowLen, colLen, rowIndx, colIndx);
                rtnBoard[rowIndx][colIndx] = isAlive;
            }
        }
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                board[i][j] = rtnBoard[i][j];
            }
        }
        return rtnBoard;
    }

    public int isAlive(int[][] board, int row, int col, int rowInx, int colInx) {
        int totalLiveNbr = 0;

        for (int rnbr = -1; rnbr < 2; rnbr++) {
            int rowI = rowInx + rnbr;
            if (!(rowI < 0 || rowI >= row)){
                for (int jnbr = -1; jnbr < 2; jnbr++ ) {
                    int colI = colInx + jnbr;
                    if (!(colI < 0 || colI >= col)) {
                        totalLiveNbr += (rowI != rowInx && colI != colInx) ? board[rowI][colI] : 0;
                    }
                }
            }
        }



//        Case 1, 2, 3
        if(board[rowInx][colInx] == 1) {
            if (totalLiveNbr < 2 || totalLiveNbr >3){
                return 0;
            } else {
                return 1;
            }
        }else {
//        Case 4
            if (totalLiveNbr == 3) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
