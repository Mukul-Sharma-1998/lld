package com.example.lld.ticTacToe.checkWinnerStratergy;

import com.example.lld.ticTacToe.Board;

public class CheckWinnerByNegativeDiagonal implements CheckWinnerStratergy{
    @Override
    public boolean checkIsWinner(Board board, int i, int j) {
        for(int r=0; r<board.rows; r++) {
            int c = board.columns - r;
            if(board.getValue(r,c) == null || board.getValue(r,c) != board.getValue(i,j)) {
                return false;
            }
        }
        return true;
    }
}
